package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;

@InterfaceC31182CLq
/* renamed from: X.Ci6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC32058Ci6 extends XBaseResultModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "tempFiles", nestedClassType = InterfaceC32059Ci7.class, required = true)
    List<InterfaceC32059Ci7> getTempFiles();

    @InterfaceC36563EWp(isGetter = false, keyPath = "tempFiles", nestedClassType = InterfaceC32059Ci7.class, required = true)
    void setTempFiles(List<? extends InterfaceC32059Ci7> list);
}
