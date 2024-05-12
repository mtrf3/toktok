package X;

import java.util.ArrayList;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5Qo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C134745Qo {
    public final InterfaceC126684y8 LIZ;
    public final ArrayList<C5JL> LIZIZ;

    public final boolean LIZ() {
        EnumC135185Sg enumC135185Sg;
        C5J1 V8 = this.LIZ.V8();
        if (V8 != null) {
            enumC135185Sg = V8.LJJIL();
        } else {
            enumC135185Sg = null;
        }
        if (enumC135185Sg == EnumC135185Sg.STARTED) {
            return true;
        }
        return false;
    }

    public final void LIZIZ() {
        EnumC135185Sg enumC135185Sg;
        C5J1 V8 = this.LIZ.V8();
        if (V8 != null) {
            enumC135185Sg = V8.LJJIL();
        } else {
            enumC135185Sg = null;
        }
        if (enumC135185Sg == EnumC135185Sg.PAUSED) {
            return;
        }
        C5J1 V82 = this.LIZ.V8();
        if (V82 != null) {
            V82.pause();
        }
        C2ND.LIZIZ(new AqS152S0100000_2(this, 1028), 50L);
    }

    public final void LIZJ() {
        final C5J1 V8 = this.LIZ.V8();
        if (V8 != null) {
            if (V8.getDuration() - V8.getCurrentPosition() < 30) {
                V8.LJJJI(0L, EnumC133595Md.EDITOR_SEEK_FLAG_LastSeek, new AnonymousClass519() { // from class: X.5Qr
                    @Override // X.AnonymousClass519
                    public final void LIZ(int i) {
                        InterfaceC132665Io.this.LIZJ();
                        InterfaceC132665Io.this.play();
                    }
                });
            } else {
                V8.play();
            }
        }
    }

    public C134745Qo(InterfaceC126684y8 mediaSession) {
        o.LJIIIZ(mediaSession, "mediaSession");
        this.LIZ = mediaSession;
        this.LIZIZ = new ArrayList<>(0);
    }

    public final void LIZLLL(long j, final boolean z, EnumC133595Md seekFlag, final AnonymousClass519 anonymousClass519) {
        Integer valueOf;
        o.LJIIIZ(seekFlag, "seekFlag");
        C5J1 V8 = this.LIZ.V8();
        if ((V8 == null || (valueOf = Integer.valueOf(V8.LJJJI(j, seekFlag, new AnonymousClass519() { // from class: X.5Qq
            @Override // X.AnonymousClass519
            public final void LIZ(int i) {
                AnonymousClass519 anonymousClass5192 = AnonymousClass519.this;
                if (anonymousClass5192 != null) {
                    anonymousClass5192.LIZ(i);
                }
                if (z) {
                    C5J1 V82 = this.LIZ.V8();
                    if (V82 != null) {
                        V82.play();
                        return;
                    }
                    return;
                }
                C5J1 V83 = this.LIZ.V8();
                if (V83 == null) {
                    return;
                }
                V83.pause();
            }
        }))) == null || valueOf.intValue() != 0) && anonymousClass519 != null) {
            anonymousClass519.LIZ(-1);
        }
    }
}
