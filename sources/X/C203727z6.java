package X;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.favorites.service.FavoriteServiceImpl;
import com.ss.android.ugc.aweme.favorites.service.IFavoriteService;
import com.zhiliaoapp.musically.R;

/* renamed from: X.7z6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C203727z6 extends C8BR<C8BS<BaseResponse>, InterfaceC203737z7> {
    public int LJLJJI;
    public int LJLJJL;
    public String LJLJL;
    public int LJLL;
    public String LJLJJLL = "";
    public final IFavoriteService LJLJLJ = FavoriteServiceImpl.LJIJJLI();
    public int LJLJLLL = 0;
    public int LJLLI = 0;
    public View LJLLILLLL = null;
    public Boolean LJLLJ = Boolean.FALSE;

    @Override // X.C8BR, X.C8BT
    public final void onSuccess() {
        int i = this.LJLJJL;
        int i2 = R.string.bny;
        if (i == 6) {
            if (this.LJLJJI == 2) {
                ((InterfaceC203737z7) this.LJLILLLLZI).gd(FKM.LIZ().getString(R.string.bny));
            }
        } else if ((i == 1 && !TextUtils.equals(this.LJLJJLL, "single_song") && !TextUtils.equals(this.LJLJJLL, "similar_song")) || this.LJLJJL == 2) {
            if (this.LJLJJL == 2 && !LJJIII(this.LJLJJLL)) {
                this.LJLJLJ.LJIIJJI(this.LJLJL);
            }
            if (this.LJLJJL != 2 || this.LJLJJI != 1 || TextUtils.equals(this.LJLJJLL, "music_dsp") || LJJIII(this.LJLJJLL)) {
                if (this.LJLJJI == 1) {
                    i2 = R.string.bnz;
                }
                ((InterfaceC203737z7) this.LJLILLLLZI).gd(FKM.LIZ().getString(i2));
            }
            if (this.LJLJJL == 2) {
                C2U8.LIZ(new C193087hw(this.LJLJL, this.LJLJJI, this.LJLL));
                C51645KOr.LIZIZ.LJIJI(this.LJLJJI, this.LJLL, this.LJLJL);
            }
        }
        if (this.LJLILLLLZI != 0) {
            T t = this.LJLIL;
            if (t != 0) {
                t.getData();
            }
            ((InterfaceC203737z7) this.LJLILLLLZI).ix();
        }
        if (!Keva.getRepo("collect").getBoolean("first_favourite_success", false) && this.LJLJJI == 1) {
            Keva.getRepo("collect").storeBoolean("first_favourite_success", true);
        }
    }

    public C203727z6() {
        LJJ(new C203717z5(this));
    }

    public static boolean LJJIII(String str) {
        if (TextUtils.equals(str, "from_duet_mode") || TextUtils.equals(str, "from_duet_mode_detail")) {
            return true;
        }
        return false;
    }

    @Override // X.C8BR, X.C8BT
    public final void onFailed(Exception exc) {
        int i = this.LJLJJL;
        int i2 = R.string.cgd;
        if (i == 5) {
            C38333F2r c38333F2r = (C38333F2r) exc;
            if (c38333F2r.getErrorCode() == 4) {
                ((InterfaceC203737z7) this.LJLILLLLZI).gd(c38333F2r.getErrorMsg());
            } else {
                if (this.LJLJJI == 1) {
                    i2 = R.string.dgl;
                }
                ((InterfaceC203737z7) this.LJLILLLLZI).gd(FKM.LIZ().getString(i2));
            }
        } else {
            if (this.LJLJJI == 1) {
                i2 = R.string.dgl;
            }
            String string = FKM.LIZ().getString(i2);
            if (this.LJLJJI != 1 || this.LJLJJL != 2) {
                ((InterfaceC203737z7) this.LJLILLLLZI).gd(string);
            }
        }
        K k = this.LJLILLLLZI;
        if (k != 0) {
            ((InterfaceC203737z7) k).aB(exc);
        }
    }
}
