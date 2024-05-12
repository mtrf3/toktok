package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.1cW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C36841cW extends RecyclerView.ViewHolder {
    public final int LJLIL;
    public C279917z LJLILLLLZI;
    public final C47061t0 LJLJI;
    public final C47061t0 LJLJJI;
    public final C47121t6 LJLJJL;
    public final C47121t6 LJLJJLL;
    public final C47121t6 LJLJL;
    public final C47121t6 LJLJLJ;
    public InterfaceC88472Yns<? super AbstractC07650Rt, C76800UCe> LJLJLLL;
    public C15540jG LJLL;

    public final void N() {
        C47061t0 c47061t0 = this.LJLJJI;
        if (c47061t0 != null) {
            c47061t0.setVisibility(8);
        }
        C15540jG c15540jG = this.LJLL;
        if (c15540jG != null) {
            c15540jG.LIZ();
        }
    }

    public final void L(C279917z c279917z) {
        C78720Uuy LJII = C15650jR.LIZ().LJII(R.drawable.d6q);
        LJII.LJIJI = Boolean.FALSE;
        LJII.LIZ(c279917z.LJFF);
        LJII.LJIIZILJ(Float.valueOf(C15380j0.LIZ(4.0f)));
        LJII.LJIIJJI(this.LJLJI);
    }

    public void P(C279917z songInfo) {
        o.LJIIIZ(songInfo, "songInfo");
        int i = C260510n.LIZIZ[songInfo.LJIILIIL.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                C47121t6 c47121t6 = this.LJLJJL;
                if (c47121t6 != null) {
                    c47121t6.setSelected(true);
                }
                N();
                return;
            }
            C47121t6 c47121t62 = this.LJLJJL;
            if (c47121t62 != null) {
                c47121t62.setSelected(true);
            }
            C47061t0 c47061t0 = this.LJLJJI;
            if (c47061t0 == null) {
                return;
            }
            if (c47061t0.getVisibility() != 4) {
                c47061t0.setVisibility(0);
            }
            C15540jG c15540jG = this.LJLL;
            if (c15540jG == null) {
                C15540jG c15540jG2 = new C15540jG();
                c15540jG2.LIZIZ = "tiktok_live_broadcast_demand_1";
                c15540jG2.LIZJ = "karaoke_playing.webp";
                c15540jG2.LJIIL = true;
                c15540jG2.LIZLLL(this.LJLJJI);
                c15540jG2.LJI = Integer.MAX_VALUE;
                c15540jG2.LJFF = true;
                c15540jG2.LJ = new C31073CHl() { // from class: X.1oI
                    @Override // X.C31073CHl
                    public final void LJFF() {
                        C0NB.LIZIZ("KaraokeSongListAdapter", "GuideAnim onResourceReady");
                    }

                    @Override // X.C31073CHl
                    public final void LJI(Animatable anim) {
                        o.LJIIIZ(anim, "anim");
                        C0NB.LIZIZ("KaraokeSongListAdapter", "Webp onStart");
                    }

                    @Override // X.C31073CHl
                    public final void LJII(Animatable anim) {
                        o.LJIIIZ(anim, "anim");
                        C0NB.LIZIZ("KaraokeSongListAdapter", "Webp onStop");
                        C47061t0 c47061t02 = C36841cW.this.LJLJJI;
                        if (c47061t02 == null) {
                            return;
                        }
                        c47061t02.setVisibility(8);
                    }
                };
                this.LJLL = c15540jG2;
                C15490jB.LJI(c15540jG2);
                return;
            }
            c15540jG.LJ();
            return;
        }
        C47121t6 c47121t63 = this.LJLJJL;
        if (c47121t63 != null) {
            c47121t63.setSelected(false);
        }
        N();
    }

    public C36841cW(int i, View view) {
        super(view);
        this.LJLIL = i;
        this.LJLJI = (C47061t0) view.findViewById(R.id.feq);
        this.LJLJJI = (C47061t0) view.findViewById(R.id.hrk);
        this.LJLJJL = (C47121t6) view.findViewById(R.id.ff0);
        this.LJLJJLL = (C47121t6) view.findViewById(R.id.fez);
        this.LJLJL = (C47121t6) view.findViewById(R.id.fey);
        this.LJLJLJ = (C47121t6) view.findViewById(R.id.fes);
    }

    public void M(C279917z songInfo, int i, EnumC24230xH payload) {
        o.LJIIIZ(songInfo, "songInfo");
        o.LJIIIZ(payload, "payload");
        this.LJLILLLLZI = songInfo;
        int i2 = C260510n.LIZ[payload.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                L(songInfo);
                return;
            }
            P(songInfo);
            return;
        }
        L(songInfo);
        C47061t0 c47061t0 = this.LJLJI;
        if (c47061t0 != null) {
            c47061t0.setTag(Long.valueOf(songInfo.LIZ));
        }
        C47121t6 c47121t6 = this.LJLJJL;
        if (c47121t6 != null) {
            c47121t6.setText(songInfo.LIZJ);
        }
        C47121t6 c47121t62 = this.LJLJJLL;
        if (c47121t62 != null) {
            c47121t62.setText(songInfo.LIZLLL);
        }
        C47121t6 c47121t63 = this.LJLJL;
        if (c47121t63 != null) {
            long j = songInfo.LJ / 1000;
            long j2 = 60;
            String LLLZI = C16880lQ.LLLZI(Locale.US, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j / j2), Long.valueOf(j % j2)}, 2));
            o.LJIIIIZZ(LLLZI, "format(locale, format, *args)");
            c47121t63.setText(LLLZI);
        }
        P(songInfo);
    }
}
