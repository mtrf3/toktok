package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C188727au;
import X.C26045AKb;
import X.C41835GbP;
import X.C48203Ivv;
import X.C54838Lfe;
import X.C56542MHa;
import X.C57323Med;
import X.C57582Mio;
import X.C76800UCe;
import X.EF7;
import X.FMX;
import X.InterfaceC88472Yns;
import X.MJ0;
import X.XKX;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.ui.MusicDetailAwemeListFragment;
import com.zhiliaoapp.musically.R;

/* loaded from: classes10.dex */
public class AqS16S2100000_9 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS16S2100000_9 aqS16S2100000_9, Object obj) {
        C41835GbP param = (C41835GbP) obj;
        o.LJIIIZ(param, "param");
        return C41835GbP.L(param, aqS16S2100000_9.s0, "show_on_video", 0, C54838Lfe.LIZLLL((Aweme) aqS16S2100000_9.l2, aqS16S2100000_9.s1), "text", 493);
    }

    public static final Object invoke$1(AqS16S2100000_9 aqS16S2100000_9, Object obj) {
        Long l;
        String str;
        if (!C48203Ivv.LJ(EF7.LIZIZ())) {
            C26045AKb c26045AKb = new C26045AKb((MusicDetailAwemeListFragment) aqS16S2100000_9.l2);
            c26045AKb.LJIIIIZZ(R.string.img);
            c26045AKb.LJIIJ();
        } else {
            T t = ((MusicDetailAwemeListFragment) aqS16S2100000_9.l2).LJLJJL.LJLIL;
            o.LJIIIIZZ(t, "mPresenter.model");
            if (t instanceof C56542MHa) {
                Music music = ((MusicDetailAwemeListFragment) aqS16S2100000_9.l2).LLILZ;
                if (music != null) {
                    l = Long.valueOf(music.getId());
                } else {
                    l = null;
                }
                String valueOf = String.valueOf(l);
                if (valueOf.length() != 0 && (str = aqS16S2100000_9.s0) != null && str.length() != 0) {
                    String str2 = ((MusicDetailAwemeListFragment) aqS16S2100000_9.l2).LJLJJI;
                    String str3 = aqS16S2100000_9.s0;
                    String str4 = aqS16S2100000_9.s1;
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("enter_method", str4);
                    c188727au.LJIIIZ("music_id", str2);
                    c188727au.LJIIIZ("old_group_id", "");
                    c188727au.LJIIIZ("group_id", str3);
                    c188727au.LJIIIZ("type", "remove");
                    FMX.LJIIL("success_featured_video", c188727au.LIZ);
                    String str5 = aqS16S2100000_9.s0;
                    MJ0 mj0 = ((C56542MHa) t).LJLL;
                    mj0.getClass();
                    if (str5 != null) {
                        XKX.LIZLLL(mj0.LIZ(), null, null, new C57323Med(valueOf, str5, null), 3);
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS16S2100000_9 aqS16S2100000_9, Object obj) {
        String str = (String) obj;
        if (str == null) {
            str = aqS16S2100000_9.s0;
        }
        ((TuxTextView) aqS16S2100000_9.l2).setText(str);
        C57582Mio.LIZ.put(aqS16S2100000_9.s1, str);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS16S2100000_9(TuxTextView tuxTextView, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l2 = tuxTextView;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS16S2100000_9(MusicDetailAwemeListFragment musicDetailAwemeListFragment, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = musicDetailAwemeListFragment;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS16S2100000_9(String str, Aweme aweme, String str2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l2 = aweme;
        this.s1 = str2;
    }
}
