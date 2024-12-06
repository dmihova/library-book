package com.tinqin.academy.library.api.operations.purchase.querypurchase;


import com.tinqin.academy.library.api.base.ProcessorInput;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.UUID;
import org.springframework.data.domain.Pageable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class QueryPurchaseInput implements ProcessorInput {

    @UUID
    private String userId;

    @UUID
    private String bookId;

    Pageable pageable;


}
