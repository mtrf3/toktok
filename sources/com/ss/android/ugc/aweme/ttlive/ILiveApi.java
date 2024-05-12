package com.ss.android.ugc.aweme.ttlive;

import X.AbstractC73672Svk;
import X.E4Q;
import X.E4T;
import X.ENW;
import X.InterfaceC195727mC;
import X.InterfaceC195737mD;
import X.InterfaceC195797mJ;
import X.InterfaceC28048Azc;
import X.InterfaceC30951CCt;
import X.InterfaceC36315ENb;
import X.InterfaceC37276Ek4;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.Map;

/* loaded from: classes7.dex */
public interface ILiveApi {
    @InterfaceC28048Azc
    @E4Q
    InterfaceC37276Ek4<TypedInput> downloadFile(@InterfaceC30951CCt boolean z, @ENW int i, @InterfaceC195797mJ String str, @InterfaceC36315ENb Map<String, String> map, @InterfaceC195737mD Object obj);

    @E4Q
    InterfaceC37276Ek4<TypedInput> get(@InterfaceC195797mJ String str, @InterfaceC36315ENb Map<String, String> map, @InterfaceC195737mD Object obj);

    @E4Q("/tiktok/v1/edibility/birthdate/")
    AbstractC73672Svk<Object> getDoBStatus();

    @E4T
    InterfaceC37276Ek4<TypedInput> post(@InterfaceC195797mJ String str, @InterfaceC195727mC TypedByteArray typedByteArray, @InterfaceC36315ENb Map<String, String> map, @InterfaceC195737mD Object obj);

    @E4T
    InterfaceC37276Ek4<TypedInput> postMultiPart(@ENW int i, @InterfaceC195797mJ String str, @InterfaceC36315ENb Map<String, String> map, @InterfaceC195727mC TypedOutput typedOutput);
}
