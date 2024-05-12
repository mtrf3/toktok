package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.ss.android.ugc.aweme.favorites.ui.UnFavouritesFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.DeleteFragment;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import com.ss.android.ugc.aweme.share.ShareExtServiceImpl;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7C4, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7C4 extends C2IJ implements InterfaceC56352Jb, C2J2 {
    public final InterfaceC72642tA<C50420Jqa> LJLL;
    public final C7C5 LJLLI;
    public C187197Wh LJLLILLLL;
    public TuxSheet LJLLJ;
    public InterfaceC44975Hkx LJLLL;
    public String LJLLLL;
    public String LJLLLLLL;
    public String LJLZ;
    public String LJZ;
    public String LJZI;

    @Override // X.C2LB
    public final void LJIIIZ() {
        this.LJLIL = null;
        C187197Wh c187197Wh = this.LJLLILLLL;
        if (c187197Wh != null) {
            c187197Wh.LJJII();
        }
    }

    @Override // X.C2IJ
    public final void LJIILL() {
    }

    @Override // X.C2IJ
    public final void LJIIZILJ() {
    }

    @Override // X.C2IJ
    public final void LJIIL() {
        InterfaceC44975Hkx interfaceC44975Hkx = this.LJLLL;
        if (interfaceC44975Hkx != null) {
            interfaceC44975Hkx.onDismiss();
        }
    }

    @Override // X.C2IJ
    public final void LJIILIIL() {
        C187197Wh c187197Wh = new C187197Wh(this.LJLIL);
        this.LJLLILLLL = c187197Wh;
        c187197Wh.LJJ(new AF9());
        try {
            FragmentManager LJ = LJ();
            Fragment LJJJIL = LJ.LJJJIL("comment");
            if (LJJJIL != null) {
                C1B3 c1b3 = new C1B3(LJ);
                c1b3.LJJI(LJJJIL);
                c1b3.LJIILJJIL();
            }
        } catch (Exception unused) {
        }
    }

    @Override // X.C2LB
    public final Activity LIZLLL() {
        return this.LJLIL;
    }

    @Override // X.C2LB
    public final Fragment LJI() {
        return this.LJLILLLLZI;
    }

    public static boolean LJIL(Aweme aweme) {
        boolean z;
        boolean booleanValue = SharePrefCache.inst().getIsPrivateAvailable().LIZ().booleanValue();
        boolean LJFF = C80S.LJFF(aweme);
        if (aweme.getAuthor() != null && C38354F3m.LIZJ(((RBX) HG3.LJIILL()).getCurUserId(), aweme.getAuthor().getUid())) {
            z = true;
        } else {
            z = false;
        }
        if (!booleanValue || !LJFF || !z) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x021c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x021d  */
    /* JADX WARN: Type inference failed for: r0v85, types: [X.700] */
    @Override // X.InterfaceC56352Jb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C2IF r12) {
        /*
            Method dump skipped, instructions count: 747
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7C4.LIZIZ(X.2IF):void");
    }

    @Override // X.C2LB
    public final void LJIIJ(String str) {
        this.LJLJJL = str;
    }

    @Override // X.C2IJ
    public final void LJIIJJI(Aweme aweme) {
        TuxSheet tuxSheet;
        if (aweme != null && (tuxSheet = this.LJLLJ) != null && tuxSheet.getDialog() != null && this.LJLLJ.getDialog().isShowing()) {
            TuxSheet tuxSheet2 = this.LJLLJ;
            if (tuxSheet2 != null && tuxSheet2.getDialog() != null) {
                this.LJLLJ.getDialog().dismiss();
                return;
            }
            throw null;
        }
    }

    @Override // X.C2IJ
    public final void LJIILJJIL(String str) {
        this.LJZI = str;
    }

    public final JSONObject LJIJJLI(Aweme aweme) {
        boolean z;
        JSONObject LIZ = RequestIdService.LJ().LIZ(this.LJLJJI, aweme);
        if (this.LJLJJLL != null) {
            if (LIZ == null) {
                LIZ = new JSONObject();
            }
            try {
                LIZ.put("enter_from", this.LJLJI);
                if ("like_banner".equals(this.LJLJJLL)) {
                    LIZ.put("previous_page", this.LJLJJLL);
                } else {
                    LIZ.put("enter_method", this.LJLJJLL);
                }
                if (aweme != null && aweme.getAwemeType() == 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    LIZ.put("is_photo", 1);
                } else {
                    LIZ.put("is_photo", 0);
                }
                LIZ.put("author_id", aweme.getAuthorUid());
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
            return LIZ;
        }
        throw new IllegalArgumentException();
    }

    @Override // X.C2IJ
    public final void LJIJ(Activity activity, Aweme aweme) {
        if ((C227768wm.LJJIIJZLJL(aweme) && aweme.isProhibited()) || C63081OpJ.LLFII(aweme) || LJIL(aweme)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("event_type", this.LJLLI.getEnterFrom(true));
        bundle.putString("enter_method", "share_head_panel");
        bundle.putString("show_reason", "personal_homepage_non_publish");
        this.LJLLL = C4LD.LIZ.LJJIJIIJIL(activity, aweme, bundle);
    }

    @Override // X.C2IJ
    public final void LJIJI(Aweme aweme, C56802Ku c56802Ku) {
        TuxSheet tuxSheet = this.LJLLJ;
        if ((tuxSheet == null || tuxSheet.getDialog() == null) && !C80S.LJFF(aweme)) {
            if ((C227768wm.LJJIIJZLJL(aweme) && aweme.isProhibited()) || C63081OpJ.LLFII(aweme) || c56802Ku == null) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putIntArray("share_button_location", c56802Ku.LJIILL);
            bundle.putString("panel_source", c56802Ku.LJIIIIZZ);
            bundle.putString("enter_method", c56802Ku.LJII);
            bundle.putString("event_type", this.LJLLI.getEnterFrom(true));
            Activity activity = this.LJLIL;
            if (activity == null) {
                return;
            }
            C4LD.LIZ.LJJJJZI(activity, this.LJLILLLLZI, aweme, LJIL(aweme), this.LJLL, bundle);
        }
    }

    @Override // X.C2IJ
    public final void LJIJJ(Activity activity, final Aweme aweme, C56802Ku shareParam) {
        boolean z;
        Activity activity2 = activity;
        if (activity2 == null) {
            activity2 = this.LJLIL;
        }
        if (activity2 == null || activity2.isFinishing() || aweme.getVideo() == null) {
            return;
        }
        int i = 1;
        if (TextUtils.equals(this.LJLJI, "collection_video") && aweme.isCollected() && (!aweme.isCanPlay() || C63081OpJ.LJLJLLL(aweme))) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Activity activity3 = this.LJLIL;
            if (activity3 == null || activity3.isFinishing() || !(activity3 instanceof ActivityC45651qj)) {
                return;
            }
            final String str = shareParam.LJII;
            final ActivityC45651qj activityC45651qj = (ActivityC45651qj) activity3;
            String str2 = this.LJLJI;
            UnFavouritesFragment unFavouritesFragment = new UnFavouritesFragment();
            unFavouritesFragment.LJLIL = str2;
            unFavouritesFragment.LJLILLLLZI = aweme;
            ASL asl = new ASL();
            TuxSheet tuxSheet = asl.LIZ;
            tuxSheet.LJLLILLLL = unFavouritesFragment;
            tuxSheet.LJLLJ = false;
            asl.LJI(1);
            DialogInterface.OnDismissListener onDismissListener = new DialogInterface.OnDismissListener() { // from class: X.89f
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    int i2;
                    ShareExtServiceImpl.LJJLIIJ().LJIIJ(aweme);
                    if (o.LJ(str, "long_press") && !activityC45651qj.isFinishing() && !activityC45651qj.isDestroyed()) {
                        ActivityC45651qj activityC45651qj2 = activityC45651qj;
                        if (activityC45651qj2 instanceof InterfaceC55058LjC) {
                            i2 = 1;
                        } else if (activityC45651qj2 instanceof InterfaceC224908sA) {
                            i2 = 2;
                        } else {
                            i2 = -1;
                        }
                        C2U8.LIZ(new C55274Lmg(i2, activityC45651qj2.hashCode()));
                    }
                }
            };
            TuxSheet tuxSheet2 = asl.LIZ;
            tuxSheet2.LJLILLLLZI = onDismissListener;
            C1DG.LJII(activityC45651qj, "act.supportFragmentManager", tuxSheet2, "UnFavouritesFragment");
            return;
        }
        final String str3 = "";
        if ((C227768wm.LJJIIJZLJL(aweme) && aweme.isProhibited()) || C63081OpJ.LLFII(aweme)) {
            if (!(activity2 instanceof ActivityC45651qj)) {
                return;
            }
            final ActivityC45651qj activityC45651qj2 = (ActivityC45651qj) activity2;
            InterfaceC72642tA<C50420Jqa> listener = this.LJLL;
            o.LJIIIZ(listener, "listener");
            o.LJIIIZ(shareParam, "shareParam");
            DeleteFragment deleteFragment = new DeleteFragment();
            deleteFragment.LJLIL = aweme;
            deleteFragment.LJLILLLLZI = listener;
            String str4 = shareParam.LJII;
            if (str4 != null) {
                str3 = str4;
            }
            ASL asl2 = new ASL();
            TuxSheet tuxSheet3 = asl2.LIZ;
            tuxSheet3.LJLLILLLL = deleteFragment;
            tuxSheet3.LJLLJ = false;
            asl2.LJI(1);
            DialogInterface.OnDismissListener onDismissListener2 = new DialogInterface.OnDismissListener() { // from class: X.89g
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    ShareExtServiceImpl.LJJLIIJ().LJIIJ(aweme);
                    if (o.LJ(str3, "long_press") && !activityC45651qj2.isFinishing() && !activityC45651qj2.isDestroyed()) {
                        C2U8.LIZ(new C55274Lmg(1, activityC45651qj2.hashCode()));
                    }
                }
            };
            TuxSheet tuxSheet4 = asl2.LIZ;
            tuxSheet4.LJLILLLLZI = onDismissListener2;
            C1DG.LJII(activityC45651qj2, "act.supportFragmentManager", tuxSheet4, "DeleteFragment");
            return;
        }
        if (LJIL(aweme)) {
            Bundle bundle = new Bundle();
            bundle.putString("play_list_type", this.LJLLLL);
            bundle.putString("play_list_id_key", this.LJLLLLLL);
            bundle.putString("play_list_id_value", this.LJLZ);
            bundle.putString("play_list_id", this.LJLZ);
            bundle.putString("play_list_type", this.LJLLLL);
            bundle.putString("enter_method", shareParam.LJII);
            bundle.putString("panel_source", shareParam.LJIIIIZZ);
            bundle.putString("play_list_id_key", this.LJLLLLLL);
            bundle.putString("tab_name", this.LJZ);
            bundle.putString("event_type", this.LJLLI.getEnterFrom(true));
            shareParam.LIZ(bundle);
            this.LJLLJ = C4LD.LIZ.LJIILJJIL(activity2, this.LJLILLLLZI, aweme, this.LJLL, bundle);
            return;
        }
        C54502LaE.LIZ("share_panel");
        Bundle bundle2 = new Bundle();
        bundle2.putString("play_list_type", this.LJLLLL);
        bundle2.putString("play_list_id_key", this.LJLLLLLL);
        bundle2.putString("play_list_id_value", this.LJLZ);
        bundle2.putString("play_list_id", this.LJLZ);
        bundle2.putString("play_list_type", this.LJLLLL);
        bundle2.putString("play_list_id_key", this.LJLLLLLL);
        bundle2.putString("tab_name", this.LJZ);
        bundle2.putString("event_type", this.LJLLI.getEnterFrom(true));
        bundle2.putString("enter_method", shareParam.LJII);
        bundle2.putString("panel_source", shareParam.LJIIIIZZ);
        if (C80S.LJIIIIZZ(aweme)) {
            i = 3;
        } else if (C80S.LIZJ(aweme)) {
            i = 2;
        } else if (!C80S.LJI(aweme) || aweme.getAuthor() == null || !aweme.getAuthor().isAccuratePrivateAccount()) {
            i = -1;
        }
        bundle2.putInt("share_im_limit_tip_type", i);
        if (aweme.getAuthor() != null) {
            str3 = aweme.getAuthor().getUniqueId();
        }
        bundle2.putString("author_user_name", str3);
        bundle2.putString("creation_id", this.LJZI);
        bundle2.putString("previousPage", C2S6.LIZ(this.LJLIL).getPreviousPage());
        bundle2.putString("previousPagePosition", C2S6.LIZ(this.LJLIL).getPreviousPagePosition());
        bundle2.putString("category_name", C2S6.LIZ(this.LJLIL).getCategoryName());
        bundle2.putString("video_from", this.LJLJJL);
        shareParam.LIZ(bundle2);
        this.LJLLJ = C4LD.LIZ.LIZ(activity2, this.LJLILLLLZI, aweme, LJIL(aweme), this.LJLL, bundle2);
    }

    public C7C4(String str, int i, InterfaceC72642tA<C50420Jqa> interfaceC72642tA, C7C5 c7c5) {
        super(str, i);
        this.LJZI = "";
        this.LJLL = interfaceC72642tA;
        this.LJLLI = c7c5;
        if (!((Boolean) C34710Djm.LJJJLL.getValue()).booleanValue()) {
            C36698Eak.LIZIZ();
        }
    }

    @Override // X.C2IJ
    public final void LJIILLIIL(String str, String str2, String str3, String str4) {
        this.LJLZ = str3;
        this.LJLLLL = str;
        this.LJLLLLLL = str2;
        this.LJZ = str4;
    }

    @Override // X.C2J2
    public final void LIZ(Activity activity, Aweme aweme, C2IL c2il, String str, String str2) {
        MixFeedService.LJJIJIIJIL().LJJIIZ(activity, aweme, c2il, str, str2);
    }

    @Override // X.C2J2
    public final void LIZJ(Activity activity, Aweme aweme, String str, String str2, String str3, String str4) {
        MixFeedService.LJJIJIIJIL().LIZLLL(activity, aweme, str, str2, str3, str4);
    }
}
