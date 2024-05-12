package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.AnonymousClass519;
import X.AnonymousClass605;
import X.C1300758p;
import X.C1303959v;
import X.C131935Ft;
import X.C135145Sc;
import X.C147295qH;
import X.C149355tb;
import X.C149905uU;
import X.C29S;
import X.C58D;
import X.C58Q;
import X.C60903NvH;
import X.C6N7;
import X.C6VL;
import X.C76800UCe;
import X.C78915Uy7;
import X.InterfaceC1278950f;
import X.InterfaceC142545ic;
import X.InterfaceC65784Pro;
import X.X1D;
import Y.IDAListenerS230S0100000_2;
import android.view.View;
import android.view.animation.AlphaAnimation;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.gamora.editorpro.EditorProScene;
import com.ss.ugc.android.editor.track.PlayPositionState;
import com.ss.ugc.android.editor.track.SeekInfo;
import com.ss.ugc.android.editor.track.TrackPanelActionListener;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS35S0210000_2;

/* loaded from: classes3.dex */
public class AqS35S0210000_2 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS35S0210000_2 aqS35S0210000_2) {
        if (aqS35S0210000_2.z2) {
            ((InterfaceC65784Pro) aqS35S0210000_2.l0).invoke();
        } else {
            C135145Sc.LIZJ();
            C6N7 c6n7 = (C6N7) aqS35S0210000_2.l1;
            c6n7.getClass();
            if (C60903NvH.LJIIJJI().LJJIII().shouldDisable10MinDraftRecord(c6n7.LIZJ)) {
                C29S c29s = c6n7.LJIIIIZZ;
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(R.string.b91);
                C78915Uy7.LJJIIZI(c29s, 1047, creativeToastBuilder);
            } else {
                C149905uU.LIZLLL(c6n7.LIZJ);
                InterfaceC142545ic interfaceC142545ic = c6n7.LJ;
                if (interfaceC142545ic != null) {
                    interfaceC142545ic.dq0();
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS35S0210000_2 aqS35S0210000_2) {
        if (!aqS35S0210000_2.z2) {
            ((C149355tb) aqS35S0210000_2.l0).LJLILLLLZI.hide((AnonymousClass605) aqS35S0210000_2.l1);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS35S0210000_2 aqS35S0210000_2) {
        ((C147295qH) aqS35S0210000_2.l0).LLLIILIL((InterfaceC65784Pro) aqS35S0210000_2.l1, aqS35S0210000_2.z2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS35S0210000_2 aqS35S0210000_2) {
        EditorProScene editorProScene = (EditorProScene) aqS35S0210000_2.l0;
        if (editorProScene.isOnShow) {
            editorProScene.getPlayground().LJJIII();
            final EditorProScene editorProScene2 = (EditorProScene) aqS35S0210000_2.l0;
            final boolean z = aqS35S0210000_2.z2;
            final View view = (View) aqS35S0210000_2.l1;
            editorProScene2.seekToPosition(z, new AnonymousClass519() { // from class: X.5Gn
                @Override // X.AnonymousClass519
                public final void LIZ(int i) {
                    editorProScene2.getEditorContext().getPlayer().W9(null);
                    boolean z2 = z;
                    C2ND.LIZIZ(new AqS35S0210000_2(view, editorProScene2, z2, 4), 0L);
                }
            });
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS35S0210000_2 aqS35S0210000_2) {
        if (aqS35S0210000_2.z2) {
            InterfaceC1278950f interfaceC1278950f = ((EditorProScene) aqS35S0210000_2.l0).previewPanel;
            if (interfaceC1278950f != null) {
                interfaceC1278950f.ol0(false);
            }
        } else {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            View view = (View) aqS35S0210000_2.l1;
            EditorProScene editorProScene = (EditorProScene) aqS35S0210000_2.l0;
            alphaAnimation.setDuration(150L);
            alphaAnimation.setAnimationListener(new IDAListenerS230S0100000_2(editorProScene, 0));
            view.startAnimation(alphaAnimation);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS35S0210000_2 aqS35S0210000_2) {
        String str = ((C58D) aqS35S0210000_2.l0).TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updatePlayState ");
        LIZ.append((PlayPositionState) aqS35S0210000_2.l1);
        LIZ.append(' ');
        C131935Ft.LIZIZ(str, X1D.LIZIZ(LIZ));
        long j = 1000;
        long position = ((PlayPositionState) aqS35S0210000_2.l1).getPosition() / j;
        int LIZIZ = (int) (C1300758p.LIZIZ() * ((float) position));
        if (((C58D) aqS35S0210000_2.l0).isRTL()) {
            LIZIZ = -LIZIZ;
        }
        if (((C58D) aqS35S0210000_2.l0)._$_findCachedViewById(R.id.dmw).getScrollX() != LIZIZ) {
            ((C1303959v) ((C58D) aqS35S0210000_2.l0)._$_findCachedViewById(R.id.jca)).LJJLL(LIZIZ);
        }
        C58D c58d = (C58D) aqS35S0210000_2.l0;
        c58d.timestamp = position;
        TrackPanelActionListener trackPanelActionListener = c58d.getTrackPanelActionListener();
        if (trackPanelActionListener != null) {
            trackPanelActionListener.onVideoPositionChanged(new SeekInfo(((C58D) aqS35S0210000_2.l0).timestamp * j, false, 0, 0.0f, 0.0f, aqS35S0210000_2.z2, false, 94, null));
        }
        C58Q innerListener = ((C58D) aqS35S0210000_2.l0).getInnerListener();
        if (innerListener != null) {
            innerListener.LIZIZ(((C58D) aqS35S0210000_2.l0).timestamp);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS35S0210000_2 aqS35S0210000_2) {
        if (aqS35S0210000_2.z2) {
            ((C6VL) aqS35S0210000_2.l0).LIZ = null;
        }
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aqS35S0210000_2.l1;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        return C76800UCe.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS35S0210000_2(android.view.View r3, com.ss.android.ugc.gamora.editorpro.EditorProScene r4, boolean r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            switch(r6) {
                case 3: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.z2 = r5
            r1.l0 = r4
            r1.l1 = r3
            r0 = 0
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.l0 = r4
            r1.z2 = r5
            r1.l1 = r3
            r0 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS35S0210000_2.<init>(android.view.View, com.ss.android.ugc.gamora.editorpro.EditorProScene, boolean, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS35S0210000_2(C58D c58d, PlayPositionState playPositionState, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c58d;
        this.l1 = playPositionState;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS35S0210000_2(C147295qH c147295qH, C147295qH c147295qH2, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(0);
        this.$t = interfaceC65784Pro;
        this.l0 = c147295qH;
        this.z2 = c147295qH2;
        this.l1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS35S0210000_2(boolean z, C149355tb c149355tb, AnonymousClass605 anonymousClass605, int i) {
        super(0);
        this.$t = i;
        this.z2 = z;
        this.l0 = c149355tb;
        this.l1 = anonymousClass605;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS35S0210000_2(boolean z, boolean z2, C6VL c6vl, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(0);
        this.$t = interfaceC65784Pro;
        this.z2 = z;
        this.l0 = z2;
        this.l1 = c6vl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS35S0210000_2(boolean z, boolean z2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, C6N7 c6n7) {
        super(0);
        this.$t = c6n7;
        this.z2 = z;
        this.l0 = z2;
        this.l1 = interfaceC65784Pro;
    }
}
