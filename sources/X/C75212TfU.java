package X;

import Y.AfS65S0100000_13;
import android.widget.TextView;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.TfU, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75212TfU implements C0WD {
    public final /* synthetic */ C75211TfT LJLIL;

    public C75212TfU(C75211TfT c75211TfT) {
        this.LJLIL = c75211TfT;
    }

    @Override // X.C0WD
    public final void Z00(LiveEffect liveEffect, String str, boolean z) {
        C73411SrX c73411SrX;
        String str2;
        if (o.LJ(str, C0TY.LIZJ)) {
            C75211TfT c75211TfT = this.LJLIL;
            TextView textView = c75211TfT.LIZ;
            String str3 = null;
            if (textView != null) {
                if (z) {
                    if (liveEffect != null) {
                        str3 = liveEffect.hint;
                    }
                    if (C29306Beo.LJIJJLI(str3)) {
                        C29306Beo.LJJLJLI(c75211TfT.LIZ);
                        TextView textView2 = c75211TfT.LIZ;
                        if (liveEffect == null || (str2 = liveEffect.hint) == null) {
                            str2 = "";
                        }
                        textView2.setText(str2);
                    } else {
                        C29306Beo.LJI(c75211TfT.LIZ);
                    }
                    if (c75211TfT.LJFF != null && (!r0.isDisposed()) && (c73411SrX = c75211TfT.LJFF) != null) {
                        c73411SrX.dispose();
                    }
                    if (c75211TfT.LIZJ.isAdded()) {
                        c75211TfT.LJFF = (C73411SrX) AbstractC73672Svk.LJJLIIIJLJLI(3L, TimeUnit.SECONDS).LJJJ(C73969T1h.LIZIZ()).LJII(BTJ.LIZIZ(c75211TfT.LIZJ)).LJJJLIIL(new AfS65S0100000_13(c75211TfT, 117), new InterfaceC64592gB() { // from class: X.9Cm
                            @Override // X.InterfaceC64592gB
                            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                            }
                        });
                    }
                } else {
                    C29306Beo.LJI(textView);
                }
            }
            C0WD c0wd = this.LJLIL.LIZLLL;
            if (c0wd != null) {
                c0wd.Z00(liveEffect, str, z);
            }
            if (liveEffect != null) {
                if (!C77412UZs.LJJ(liveEffect) && !C77412UZs.LJIL(liveEffect)) {
                    LiveEffect.StickerSDKExtra stickerSDKExtra = liveEffect.sdkExtraModel;
                    if (stickerSDKExtra != null) {
                        if (stickerSDKExtra.pl == null) {
                            if (liveEffect == null) {
                                return;
                            }
                        }
                    }
                    if (!C77412UZs.LJJII(liveEffect)) {
                        return;
                    }
                }
                if (z) {
                    C75211TfT c75211TfT2 = this.LJLIL;
                    c75211TfT2.getClass();
                    C75422Tis c75422Tis = c75211TfT2.LJ;
                    if (c75422Tis != null) {
                        c75422Tis.LJIIIIZZ();
                        return;
                    }
                    return;
                }
                C75211TfT c75211TfT3 = this.LJLIL;
                c75211TfT3.getClass();
                C75422Tis c75422Tis2 = c75211TfT3.LJ;
                if (c75422Tis2 == null) {
                    return;
                }
                c75422Tis2.LJIIIZ();
            }
        }
    }
}
