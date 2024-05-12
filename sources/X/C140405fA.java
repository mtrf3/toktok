package X;

import com.ss.android.ugc.aweme.services.editeffect.model.EditEffectAnchorInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.5fA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C140405fA extends AbstractC65781Prl implements InterfaceC88472Yns<EditEffectAnchorInfo, CharSequence> {
    public static final C140405fA LJLIL = new C140405fA();

    public C140405fA() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(EditEffectAnchorInfo editEffectAnchorInfo) {
        EditEffectAnchorInfo it = editEffectAnchorInfo;
        o.LJIIIZ(it, "it");
        return it.getEffectId();
    }
}
