package X;

import android.os.Message;
import android.os.SystemClock;
import android.view.SurfaceView;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorListener;
import kotlin.jvm.internal.o;

/* renamed from: X.5JN, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5JN extends AbstractC29891Fh<C5JU> implements C5JU, InterfaceC135635Tz {
    public final C82622Wbi LJLIL;
    public final C5JU LJLILLLLZI;
    public volatile InterfaceC126684y8 LJLJI;
    public C5JS LJLJJI;
    public NLEEditorListener LJLJJL;
    public final NLEEditor LJLJJLL;
    public boolean LJLJL;
    public SurfaceView LJLJLJ;
    public final C5DS LJLJLLL;
    public final C5DP LJLL;
    public C5JL LJLLI;
    public C5J0 LJLLILLLL;

    @Override // X.C5JU
    public long H9() {
        long j;
        C5J1 V8;
        InterfaceC126684y8 interfaceC126684y8 = this.LJLJI;
        if (interfaceC126684y8 != null && (V8 = interfaceC126684y8.V8()) != null) {
            j = V8.getCurrentPosition();
        } else {
            j = 0;
        }
        return j / 1000;
    }

    @Override // X.C5JU
    public InterfaceC126684y8 QO() {
        InterfaceC126684y8 interfaceC126684y8 = this.LJLJI;
        if (interfaceC126684y8 != null) {
            return interfaceC126684y8;
        }
        throw new IllegalStateException("NLECropComponent not initialized.");
    }

    @Override // X.C5JU
    public void pause() {
        C5J1 V8;
        if (!this.LJLJL) {
            return;
        }
        removeMessages(100);
        C5JS c5js = this.LJLJJI;
        if (c5js != null) {
            c5js.LIZIZ(C52X.PAUSE);
        }
        this.LJLJL = false;
        InterfaceC126684y8 interfaceC126684y8 = this.LJLJI;
        if (interfaceC126684y8 != null && (V8 = interfaceC126684y8.V8()) != null) {
            V8.pause();
        }
    }

    @Override // X.C5JU
    public void release() {
        C5J1 V8;
        C5J1 V82;
        InterfaceC126684y8 interfaceC126684y8 = this.LJLJI;
        if (interfaceC126684y8 != null && (V82 = interfaceC126684y8.V8()) != null) {
            V82.LJJJJJL(this.LJLLI);
        }
        InterfaceC126684y8 interfaceC126684y82 = this.LJLJI;
        if (interfaceC126684y82 != null && (V8 = interfaceC126684y82.V8()) != null) {
            V8.LJJJJJ(null);
        }
        NLEEditorListener nLEEditorListener = this.LJLJJL;
        if (nLEEditorListener != null) {
            this.LJLJJLL.removeConsumer(nLEEditorListener);
            this.LJLJJL = null;
        }
        this.LJLJI = null;
        this.LJLJJI = null;
        this.LJLJLJ = null;
    }

    @Override // X.C5JU
    public long s5() {
        long j;
        C5J1 V8;
        InterfaceC126684y8 interfaceC126684y8 = this.LJLJI;
        if (interfaceC126684y8 != null && (V8 = interfaceC126684y8.V8()) != null) {
            j = V8.getDuration();
        } else {
            j = 0;
        }
        return j / 1000;
    }

    @Override // X.C5JU
    public void play() {
        C5J1 V8;
        C5J1 V82;
        C5J1 V83;
        if (s5() - H9() < 50) {
            InterfaceC126684y8 interfaceC126684y8 = this.LJLJI;
            if (interfaceC126684y8 != null && (V83 = interfaceC126684y8.V8()) != null) {
                V83.LIZJ();
            }
            InterfaceC126684y8 interfaceC126684y82 = this.LJLJI;
            if (interfaceC126684y82 != null && (V82 = interfaceC126684y82.V8()) != null) {
                V82.LJIJ(0L, EnumC133595Md.EDITOR_SEEK_FLAG_LastSeek);
            }
            C5JS c5js = this.LJLJJI;
            if (c5js != null) {
                c5js.LIZ(0L, false);
            }
        }
        this.LJLL.getClass();
        SystemClock.elapsedRealtime();
        C5JS c5js2 = this.LJLJJI;
        if (c5js2 != null) {
            c5js2.LIZIZ(C52X.PLAY);
        }
        this.LJLJL = true;
        InterfaceC126684y8 interfaceC126684y83 = this.LJLJI;
        if (interfaceC126684y83 != null && (V8 = interfaceC126684y83.V8()) != null) {
            V8.play();
        }
    }

    @Override // X.C5JU
    public NLEEditor Pm0() {
        return this.LJLJJLL;
    }

    @Override // X.C5JU
    public InterfaceC126684y8 Yw() {
        return this.LJLJI;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ C5JU getApiComponent() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C5JN(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = this;
        this.LJLJJLL = new NLEEditor();
        C5DS c5ds = new C5DS() { // from class: X.5JQ
            @Override // X.C5DS
            public final void handleMsg(Message message) {
                C5JS c5js = C5JN.this.LJLJJI;
                if (c5js != null) {
                    c5js.LIZ(message.arg1, false);
                }
            }
        };
        this.LJLJLLL = c5ds;
        this.LJLL = new C5DP(c5ds);
        this.LJLLI = new C5JL() { // from class: X.5JP
            @Override // X.C5JL
            public final void LIZ(int i, int i2, float f, String str) {
                if (4098 == i) {
                    C5JN.this.pause();
                    C5JN c5jn = C5JN.this;
                    c5jn.LJLL.LIZ((int) c5jn.s5());
                }
            }
        };
        this.LJLLILLLL = new C5J0() { // from class: X.5JR
            @Override // X.C5J0
            public final void LIZ(int i, long j) {
                if (i == 0) {
                    C5JN c5jn = C5JN.this;
                    if (c5jn.LJLJL) {
                        c5jn.LJLL.LIZ(((int) j) / 1000);
                    }
                }
            }
        };
    }

    @Override // X.C5JU
    public void y20(C5JS listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLJJI = listener;
    }

    @Override // X.C5JU
    public void A3(long j, AnonymousClass519 anonymousClass519) {
        C5J1 V8;
        C5JS c5js = this.LJLJJI;
        if (c5js != null) {
            c5js.LIZIZ(C52X.PAUSE);
        }
        removeMessages(100);
        this.LJLJL = false;
        InterfaceC126684y8 interfaceC126684y8 = this.LJLJI;
        if (interfaceC126684y8 != null && (V8 = interfaceC126684y8.V8()) != null) {
            V8.LJJJI(C124574uj.LJJLIIIJJIZ(j), EnumC133595Md.EDITOR_SEEK_FLAG_LastSeek, anonymousClass519);
        }
        C5JS c5js2 = this.LJLJJI;
        if (c5js2 != null) {
            c5js2.LIZ(j, true);
        }
    }

    @Override // X.C5JU
    public void t90(SurfaceView surfaceView, InterfaceC126684y8 interfaceC126684y8, String nleModel, long j) {
        C133775Mv P8;
        C5J1 V8;
        C5J1 V82;
        o.LJIIIZ(surfaceView, "surfaceView");
        o.LJIIIZ(nleModel, "nleModel");
        this.LJLJI = interfaceC126684y8;
        InterfaceC126684y8 interfaceC126684y82 = this.LJLJI;
        if (interfaceC126684y82 != null && (V82 = interfaceC126684y82.V8()) != null) {
            V82.LJJJJI(this.LJLLI);
        }
        InterfaceC126684y8 interfaceC126684y83 = this.LJLJI;
        if (interfaceC126684y83 != null && (V8 = interfaceC126684y83.V8()) != null) {
            V8.LJJJJJ(this.LJLLILLLL);
        }
        InterfaceC126684y8 interfaceC126684y84 = this.LJLJI;
        if (interfaceC126684y84 != null && (P8 = interfaceC126684y84.P8()) != null) {
            P8.LJIJJLI(1.0f, 1.0f, 0.0f, 0, 0);
        }
        InterfaceC126684y8 interfaceC126684y85 = this.LJLJI;
        if (interfaceC126684y85 != null) {
            interfaceC126684y85.T8(this.LJLJJLL);
        }
        NLEEditorListener nLEEditorListener = new NLEEditorListener() { // from class: X.5JO
            public volatile boolean LIZ = true;

            @Override // com.bytedance.ies.nle.editor_jni.NLEEditorListener
            public final void onChanged() {
                if (this.LIZ) {
                    this.LIZ = false;
                    return;
                }
                InterfaceC126684y8 interfaceC126684y86 = C5JN.this.LJLJI;
                if (interfaceC126684y86 == null) {
                    return;
                }
                interfaceC126684y86.R8(C5JN.this.LJLJJLL.LJ());
            }
        };
        this.LJLJJLL.addConsumer(nLEEditorListener);
        this.LJLJJL = nLEEditorListener;
        this.LJLJJLL.LJI(nleModel);
    }
}
