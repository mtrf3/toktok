package X;

import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import kotlin.jvm.internal.o;

/* renamed from: X.HmT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45069HmT extends AbstractC65781Prl implements InterfaceC88472Yns<AutoCutMediaModel, CharSequence> {
    public static final C45069HmT LJLIL = new C45069HmT();

    public C45069HmT() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(AutoCutMediaModel autoCutMediaModel) {
        AutoCutMediaModel it = autoCutMediaModel;
        o.LJIIIZ(it, "it");
        return it.filePath;
    }
}
