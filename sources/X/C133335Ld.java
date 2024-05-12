package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5Ld, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C133335Ld extends F9E {
    public final InterfaceC88472Yns<Boolean, C76800UCe> LJLIL;
    public final InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public final InterfaceC88472Yns<Boolean, C76800UCe> LJLJI;
    public final InterfaceC88471Ynr<Float, Boolean, C76800UCe> LJLJJI;
    public final InterfaceC88472Yns<NLETrackSlot, C76800UCe> LJLJJL;
    public final InterfaceC88472Yns<Effect, C76800UCe> LJLJJLL;
    public final InterfaceC88474Ynu<NLETrackSlot, Float, Boolean, Boolean, C76800UCe> LJLJL;
    public final InterfaceC65784Pro<C76800UCe> LJLJLJ;

    public C133335Ld() {
        this(null, null, null, null, null, null, 255);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ};
    }

    public C133335Ld(AqS168S0100000_2 aqS168S0100000_2, AqS152S0100000_2 aqS152S0100000_2, AqS168S0100000_2 aqS168S0100000_22, AqS168S0100000_2 aqS168S0100000_23, AqS168S0100000_2 aqS168S0100000_24, AqS152S0100000_2 aqS152S0100000_22, int i) {
        C63502eQ onSeekCursorManually;
        InterfaceC88472Yns saveOrCancel = aqS168S0100000_2;
        saveOrCancel = (i & 1) != 0 ? C133435Ln.LJLIL : saveOrCancel;
        InterfaceC65784Pro playOrPause = aqS152S0100000_2;
        playOrPause = (i & 2) != 0 ? C133535Lx.LJLIL : playOrPause;
        InterfaceC88472Yns undoOrRedo = aqS168S0100000_22;
        undoOrRedo = (i & 4) != 0 ? C133445Lo.LJLIL : undoOrRedo;
        if ((i & 8) != 0) {
            onSeekCursorManually = C63502eQ.LJLIL;
        } else {
            onSeekCursorManually = null;
        }
        InterfaceC88472Yns deleteSelectedEffect = aqS168S0100000_23;
        deleteSelectedEffect = (i & 16) != 0 ? C133465Lq.LJLIL : deleteSelectedEffect;
        InterfaceC88472Yns deleteEffectSlotsByEffect = aqS168S0100000_24;
        deleteEffectSlotsByEffect = (i & 32) != 0 ? C133475Lr.LJLIL : deleteEffectSlotsByEffect;
        C123784tS onClipEffect = (i & 64) != 0 ? C123784tS.LJLIL : null;
        InterfaceC65784Pro unselectSlot = aqS152S0100000_22;
        unselectSlot = (i & 128) != 0 ? C133545Ly.LJLIL : unselectSlot;
        o.LJIIIZ(saveOrCancel, "saveOrCancel");
        o.LJIIIZ(playOrPause, "playOrPause");
        o.LJIIIZ(undoOrRedo, "undoOrRedo");
        o.LJIIIZ(onSeekCursorManually, "onSeekCursorManually");
        o.LJIIIZ(deleteSelectedEffect, "deleteSelectedEffect");
        o.LJIIIZ(deleteEffectSlotsByEffect, "deleteEffectSlotsByEffect");
        o.LJIIIZ(onClipEffect, "onClipEffect");
        o.LJIIIZ(unselectSlot, "unselectSlot");
        this.LJLIL = saveOrCancel;
        this.LJLILLLLZI = playOrPause;
        this.LJLJI = undoOrRedo;
        this.LJLJJI = onSeekCursorManually;
        this.LJLJJL = deleteSelectedEffect;
        this.LJLJJLL = deleteEffectSlotsByEffect;
        this.LJLJL = onClipEffect;
        this.LJLJLJ = unselectSlot;
    }
}
