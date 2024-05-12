package X;

import Y.ACListenerS24S0100000_4;
import Y.ACListenerS30S0300000_4;
import Y.ACListenerS32S0100000_12;
import Y.ACListenerS39S0200000_4;
import Y.ACListenerS46S0200000_12;
import Y.AObserverS75S0200000_12;
import Y.IDrS14S0200000_12;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IProfileBadgeService;
import com.ss.android.ugc.aweme.IProfileNaviService;
import com.ss.android.ugc.aweme.ProfileNaviServiceImpl;
import com.ss.android.ugc.aweme.account.profilebadge.ProfileBadgeServiceImpl;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.aigc.ProfileBadgeSettingsObject;
import com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.improve.pkg.UserSharePackage;
import com.ss.android.ugc.navi.NaviProfileCarouselViewModel;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS191S0100000_9;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.SgP, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class DialogC72721SgP extends DialogC62475OfX implements APR, InterfaceC72728SgW {
    public final User LJLLJ;
    public final Activity LJLLL;
    public final InterfaceC72729SgX LJLLLL;
    public final C73318Sq2 LJLLLLLL;
    public InterfaceC65784Pro<C76800UCe> LJLZ;
    public ImageView LJZ;
    public SmartImageView LJZI;
    public SY4 LJZL;
    public final LifecycleOwner LL;
    public final ActivityC45651qj LLD;
    public C72724SgS LLF;
    public final C62822Ol8 LLFF;
    public boolean LLFFF;
    public SmartImageView LLFII;
    public TextView LLFZ;
    public TextView LLI;
    public LinearLayout LLIFFJFJJ;
    public Switch LLII;
    public SY4 LLIIII;
    public View LLIIIILZ;
    public View LLIIIJ;
    public C208298Fl LLIIIL;
    public SY4 LLIIIZ;
    public final IProfileBadgeService LLIIJI;
    public final User LLIIJLIL;
    public final String LLIIL;
    public final String LLIILII;
    public final C72727SgV LLIILZL;

    @Override // X.APR
    public final void LJFF() {
        if (this.LJLLL.isFinishing() || new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/AvatarEditableShareDialog", "show", this, new Object[0], "void", new C65300Pk0(false, "()V", "-8475974362745538805")).LIZ) {
            return;
        }
        show();
    }

    public final boolean LJJIFFI() {
        Long id;
        ProfileBadgeStruct profileBadge = this.LJLLJ.getProfileBadge();
        if (profileBadge != null && (id = profileBadge.getId()) != null && id.longValue() != 0) {
            return true;
        }
        return false;
    }

    public final String LJJII() {
        if (!o.LJ(this.LLIIJLIL.getUid(), this.LJLLJ.getUid()) || C255199zv.LJIIJ(this.LJLLJ, "photo", "video")) {
            return "click_head";
        }
        return "click_empty_avatar";
    }

    public final NaviProfileCarouselViewModel LJJIII() {
        return (NaviProfileCarouselViewModel) this.LLFF.getValue();
    }

    public final boolean LJJIIJZLJL() {
        UrlModel avatarVideoUri;
        User user = this.LJLLJ;
        if (C79043V0l.LJJI(user, C78688UuS.LJJI(user)) || (avatarVideoUri = this.LJLLJ.getAvatarVideoUri()) == null || avatarVideoUri.getUrlList() == null || avatarVideoUri.getUrlList().size() <= 0) {
            return false;
        }
        return true;
    }

    public final void LJJIJIIJI() {
        View snappedView;
        boolean z;
        C208298Fl c208298Fl = this.LLIIIL;
        if (c208298Fl != null && (snappedView = c208298Fl.getSnappedView()) != null && this.LLIIIL != null) {
            int LJJJJIZL = RecyclerView.LJJJJIZL(snappedView);
            if (LJJIII().LJLIL.getValue() != null) {
                z = true;
            } else {
                z = false;
            }
            if (LJJJJIZL == 0) {
                SY4 sy4 = this.LLIIIZ;
                if (sy4 != null) {
                    sy4.setText(getContext().getString(R.string.c11));
                }
                SY4 sy42 = this.LLIIIZ;
                if (sy42 != null) {
                    sy42.setVisibility(0);
                }
                SY4 sy43 = this.LLIIIZ;
                if (sy43 == null) {
                    return;
                }
                sy43.setEnabled(z);
                return;
            }
            if (LJJJJIZL >= 2) {
                SY4 sy44 = this.LLIIIZ;
                if (sy44 != null) {
                    sy44.setText(getContext().getString(R.string.c25));
                }
                SY4 sy45 = this.LLIIIZ;
                if (sy45 != null) {
                    sy45.setVisibility(0);
                }
                SY4 sy46 = this.LLIIIZ;
                if (sy46 == null) {
                    return;
                }
                sy46.setEnabled(true);
                return;
            }
            SY4 sy47 = this.LLIIIZ;
            if (sy47 == null) {
                return;
            }
            sy47.setVisibility(4);
        }
    }

    @Override // X.APR
    public final void dismissDialog() {
        if (this.LJLLL.isDestroyed() || this.LJLLL.isFinishing() || !isShowing()) {
            return;
        }
        dismiss();
    }

    public final boolean LJJIIJ() {
        ProfileBadgeStruct profileBadge;
        Long id;
        ProfileBadgeStruct profileBadge2;
        ProfileBadgeStruct profileBadge3;
        Long id2;
        ProfileBadgeSettingsObject profileBadgeSettingsObject;
        if (!C26356AWa.LIZ()) {
            return false;
        }
        if (!o.LJ(this.LLIIJLIL.getUid(), this.LJLLJ.getUid()) || !LJJIFFI()) {
            if (o.LJ(this.LLIIJLIL.getUid(), this.LJLLJ.getUid()) || !LJJIFFI()) {
                return false;
            }
            User user = this.LJLLJ;
            if (user != null && (profileBadge = user.getProfileBadge()) != null && (id = profileBadge.getId()) != null && id.longValue() != 0 && C79043V0l.LJIIJJI(user)) {
                String str = null;
                if (user != null && (profileBadge3 = user.getProfileBadge()) != null && (id2 = profileBadge3.getId()) != null) {
                    String id3 = String.valueOf(id2.longValue());
                    o.LJIIIZ(id3, "id");
                    C35983EAh c35983EAh = C35984EAi.LIZ;
                    if (c35983EAh != null && (profileBadgeSettingsObject = (ProfileBadgeSettingsObject) c35983EAh.get((Object) id3)) != null) {
                        str = profileBadgeSettingsObject.name;
                    }
                }
                if (o.LJ(str, "aigc_avatar") && user != null && (profileBadge2 = user.getProfileBadge()) != null && profileBadge2.getShouldShow()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // X.DialogC62475OfX, X.C18Z, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        int i;
        super.dismiss();
        this.LLIIJI.unsubscribe(this.LLIILZL);
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLZ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        if (this.LLFFF) {
            if (this.LLIIIL != null) {
                i = 1;
            } else {
                i = 0;
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "personal_homepage");
            c188727au.LJIIIZ("enter_method", "click_head");
            c188727au.LJIIIZ("exit_method", "click_cancel");
            c188727au.LIZLLL(i, "is_avatar");
            FMX.LJIIL("cancel_profile_photo", c188727au.LIZ);
        }
        LJJIII().LJLIL.removeObservers(this.LL);
        this.LJLLLLLL.LIZLLL();
    }

    public static void LJJIIZI(SY4 sy4) {
        int i;
        sy4.setVisibility(0);
        sy4.setButtonVariant(5);
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(4));
        int LJJIIZ2 = O6R.LJJIIZ(C32151Nz.LJIIZILJ(4));
        C26338AVi.LJIIIZ(sy4, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8))), Integer.valueOf(LJJIIZ), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8))), Integer.valueOf(LJJIIZ2), 16);
        Context context = sy4.getContext();
        o.LJIIIIZZ(context, "context");
        Integer LJI = C79045V0n.LJI(R.attr.go, context);
        if (LJI != null) {
            i = LJI.intValue();
        } else {
            i = -16777216;
        }
        sy4.setTextColor(i);
        sy4.LJJJIL(true);
        sy4.setTuxFont(62);
        sy4.setButtonSize(2);
        sy4.setMinTextSize(10.0f);
    }

    @Override // X.APR
    public final void LIZIZ(String filePath) {
        o.LJIIIZ(filePath, "filePath");
        try {
            android.net.Uri fromFile = android.net.Uri.fromFile(new File(filePath));
            o.LJIIIIZZ(fromFile, "fromFile(File(filePath))");
            if (this.LJZI != null && LJJIIJZLJL()) {
                W5F LJFF = W5U.LJFF(fromFile);
                LJFF.LJJIJIIJIL = true;
                LJFF.LIZLLL = true;
                LJFF.LJJIIJ = this.LJZI;
                LJFF.LIZIZ("AvatarEditableShareDialog");
                C16880lQ.LLJJJ(LJFF);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.InterfaceC72728SgW
    public final void LIZJ(View view) {
        int i;
        o.LJIIIZ(view, "view");
        IProfileNaviService LJIIL = ProfileNaviServiceImpl.LJIIL();
        List<InterfaceC72668SfY> value = LJJIII().LJLIL.getValue();
        if (value != null) {
            i = value.size();
        } else {
            i = 0;
        }
        if (!LJIIL.LJFF(this, i)) {
            return;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "profile_photo_page");
        FMX.LJIIL("profile_carousel_create_avatar", c188727au.LIZ);
        this.LLFFF = false;
        dismiss();
        IProfileNaviService LJIIL2 = ProfileNaviServiceImpl.LJIIL();
        o.LJIIIIZZ(LJIIL2, "get().getService(IProfileNaviService::class.java)");
        LJIIL2.LJIIJ(this.LJLLL, view, "profile_photo_page", new C61658OHu(null, 7));
    }

    @Override // X.InterfaceC72728SgW
    public final void LJIILIIL(boolean z) {
        this.LLFFF = false;
        dismiss();
        boolean LJ = a.LJ().LJ(4);
        LJJIIZ(!LJ);
        if (LJ) {
            return;
        }
        if (!z && LJJIIJZLJL()) {
            this.LJLLLL.LIZIZ();
        } else {
            this.LJLLLL.LIZ();
        }
    }

    public final void LJJI(ProfileBadgeStruct profileBadgeStruct) {
        String str;
        if (this.LLFII != null && this.LLFZ != null && this.LLI != null) {
            boolean z = true;
            if (profileBadgeStruct != null && profileBadgeStruct.getUrl().length() != 0 && profileBadgeStruct.getShouldShow()) {
                z = false;
            }
            if (AV1.LJIIJJI() || z) {
                SmartImageView smartImageView = this.LLFII;
                if (smartImageView != null) {
                    smartImageView.setVisibility(8);
                }
                TextView textView = this.LLFZ;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                TextView textView2 = this.LLI;
                if (textView2 == null) {
                    return;
                }
                textView2.setVisibility(8);
                return;
            }
            if (profileBadgeStruct != null) {
                str = profileBadgeStruct.getUrl();
            } else {
                str = null;
            }
            o.LJI(str);
            W5F LJIIIIZZ = W5U.LJIIIIZZ(str);
            LJIIIIZZ.LJJIIJ = this.LLFII;
            LJIIIIZZ.LIZIZ(this.LLIILII);
            C16880lQ.LLJJJ(LJIIIIZZ);
            TextView textView3 = this.LLFZ;
            if (textView3 != null) {
                textView3.setText(profileBadgeStruct.getName());
            }
            TextView textView4 = this.LLI;
            if (textView4 != null) {
                textView4.setText(profileBadgeStruct.getDescription());
            }
            SmartImageView smartImageView2 = this.LLFII;
            if (smartImageView2 != null) {
                smartImageView2.setVisibility(0);
            }
            TextView textView5 = this.LLFZ;
            if (textView5 != null) {
                textView5.setVisibility(0);
            }
            TextView textView6 = this.LLI;
            if (textView6 == null) {
                return;
            }
            textView6.setVisibility(0);
        }
    }

    public final void LJJIIZ(boolean z) {
        int i;
        int i2;
        ImageView imageView = this.LJZ;
        if (imageView != null) {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_pen;
            if (z) {
                i = R.attr.go;
            } else {
                i = R.attr.gp;
            }
            c2068389v.LJ = Integer.valueOf(i);
            c2068389v.LIZIZ = C7MY.LIZIZ(16);
            c2068389v.LIZJ = C7MY.LIZIZ(16);
            Context context = getContext();
            o.LJIIIIZZ(context, "this.context");
            SY9 LIZ = c2068389v.LIZ(context);
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.cl);
            if (z) {
                i2 = R.attr.dw;
            } else {
                i2 = R.attr.dz;
            }
            c110614Vt.LJFF = Integer.valueOf(i2);
            c110614Vt.LIZLLL = AnonymousClass391.LIZJ(1);
            c110614Vt.LJII = C7MY.LIZIZ(32);
            c110614Vt.LJI = C7MY.LIZIZ(32);
            c110614Vt.LIZJ = C61328O5c.LIZJ(50);
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "this.context");
            imageView.setImageDrawable(C26338AVi.LJIIJ(LIZ, c110614Vt.LIZ(context2)));
        }
    }

    @Override // X.DialogC62475OfX, X.DialogC62478Ofa, X.C18Z, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        TextView textView;
        SY4 sy4;
        ProfileBadgeSettingsObject profileBadgeSettingsObject;
        String str;
        String str2;
        String str3;
        String str4;
        SY4 sy42;
        Long l;
        Long l2;
        String str5;
        ProfileBadgeSettingsObject profileBadgeSettingsObject2;
        String str6;
        super.onCreate(bundle);
        this.LLIIJI.subscribe(this.LLIILZL);
        this.LLFII = (SmartImageView) findViewById(R.id.i_k);
        this.LLFZ = (TextView) findViewById(R.id.i_r);
        this.LLI = (TextView) findViewById(R.id.i_o);
        this.LLIFFJFJJ = (LinearLayout) findViewById(R.id.i_q);
        this.LLII = (Switch) findViewById(R.id.i_p);
        SY4 sy43 = (SY4) findViewById(R.id.i_n);
        this.LLIIII = sy43;
        if (C99W.LIZ) {
            if (sy43 != null) {
                sy43.setButtonVariant(5);
            }
        } else if (sy43 != null) {
            sy43.setButtonVariant(1);
        }
        this.LLIIIILZ = findViewById(R.id.i_l);
        this.LLIIIJ = findViewById(R.id.i_m);
        this.LLIIIL = (C208298Fl) findViewById(R.id.gx_);
        this.LLIIIZ = (SY4) findViewById(R.id.gy8);
        this.LJZ = (ImageView) findViewById(R.id.i9v);
        this.LJZI = (SmartImageView) findViewById(R.id.i9t);
        this.LJZL = (SY4) findViewById(R.id.i_d);
        C208298Fl c208298Fl = this.LLIIIL;
        String str7 = null;
        if (c208298Fl != null && (this.LJLLL instanceof ViewModelStoreOwner)) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "profile_photo_page");
            FMX.LJIIL("show_avatar_carousel", c188727au.LIZ);
            LJJIII().LJLIL.observe(this.LL, new AObserverS75S0200000_12(this, c208298Fl, 47));
            SY4 sy44 = this.LLIIIZ;
            if (sy44 != null) {
                C16880lQ.LJJIZ(sy44, new ACListenerS46S0200000_12(c208298Fl, this, 66));
            }
            c208298Fl.LJIIJJI(new IDrS14S0200000_12(this, c208298Fl, 4));
            C72724SgS c72724SgS = new C72724SgS(this.LJLLJ, this);
            this.LLF = c72724SgS;
            c208298Fl.setAdapter(c72724SgS);
            NaviProfileCarouselViewModel LJJIII = LJJIII();
            LJJIII.LJLIL.setValue(null);
            LJJIII.LJLILLLLZI = 0;
            ProfileNaviServiceImpl.LJIIL().LIZLLL(LJJIII.LJLILLLLZI, new AqS191S0100000_9(LJJIII, 2));
        }
        if (((RBX) HG3.LJIILL()).isMe(this.LJLLJ.getUid())) {
            ImageView imageView = this.LJZ;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
        } else {
            ImageView imageView2 = this.LJZ;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        C62390OeA c62390OeA = UserSharePackage.Companion;
        User user = this.LJLLJ;
        c62390OeA.getClass();
        if (C62390OeA.LIZLLL(user)) {
            ProfileBadgeStruct profileBadge = this.LJLLJ.getProfileBadge();
            if (profileBadge != null && !AV1.LJIIJJI()) {
                LJJI(profileBadge);
                String valueOf = String.valueOf(profileBadge.getId());
                C35983EAh c35983EAh = C35984EAi.LIZ;
                if (c35983EAh != null) {
                    profileBadgeSettingsObject = (ProfileBadgeSettingsObject) c35983EAh.get((Object) valueOf);
                } else {
                    profileBadgeSettingsObject = null;
                }
                Object obj = "";
                if (o.LJ(this.LLIIJLIL.getUid(), this.LJLLJ.getUid())) {
                    if (profileBadgeSettingsObject != null && o.LJ(profileBadgeSettingsObject.multipleBadges, Boolean.TRUE)) {
                        LinearLayout linearLayout = this.LLIFFJFJJ;
                        if (linearLayout != null) {
                            linearLayout.setVisibility(8);
                        }
                        LJJIJ(this.LJZL, this.LLIIII);
                        View view = this.LLIIIILZ;
                        if (view != null) {
                            view.setVisibility(0);
                        }
                        View view2 = this.LLIIIJ;
                        if (view2 != null) {
                            view2.setVisibility(8);
                        }
                        String valueOf2 = String.valueOf(profileBadge.getId());
                        if (c35983EAh != null && (profileBadgeSettingsObject2 = (ProfileBadgeSettingsObject) c35983EAh.get((Object) valueOf2)) != null && (str6 = profileBadgeSettingsObject2.ctaChangeBadge) != null && C78857UxB.LJJJIL(str6)) {
                            str7 = str6;
                        }
                        SY4 sy45 = this.LLIIII;
                        if (sy45 != null) {
                            sy45.setText(str7);
                        }
                        SY4 sy46 = this.LLIIII;
                        if (sy46 != null) {
                            C16880lQ.LJJIZ(sy46, new ACListenerS46S0200000_12(this, profileBadge, 67));
                        }
                    } else {
                        TextView textView2 = this.LLI;
                        if (textView2 != null) {
                            textView2.setVisibility(8);
                        }
                        LinearLayout linearLayout2 = this.LLIFFJFJJ;
                        if (linearLayout2 != null) {
                            linearLayout2.setVisibility(0);
                        }
                        SY4 sy47 = this.LLIIII;
                        if (sy47 != null) {
                            sy47.setVisibility(8);
                        }
                        View view3 = this.LLIIIILZ;
                        if (view3 != null) {
                            view3.setVisibility(8);
                        }
                        View view4 = this.LLIIIJ;
                        if (view4 != null) {
                            view4.setVisibility(8);
                        }
                        Switch r0 = this.LLII;
                        if (r0 != null) {
                            r0.setOnCheckedChangeListener(null);
                        }
                        Switch r4 = this.LLII;
                        if (r4 != null) {
                            r4.setChecked(profileBadge.getShouldShow());
                        }
                        Switch r02 = this.LLII;
                        if (r02 != null && r02.isChecked()) {
                            SmartImageView smartImageView = this.LLFII;
                            if (smartImageView != null) {
                                smartImageView.setVisibility(0);
                            }
                            TextView textView3 = this.LLFZ;
                            if (textView3 != null) {
                                textView3.setVisibility(0);
                            }
                        } else {
                            SmartImageView smartImageView2 = this.LLFII;
                            if (smartImageView2 != null) {
                                smartImageView2.setVisibility(8);
                            }
                            TextView textView4 = this.LLFZ;
                            if (textView4 != null) {
                                textView4.setVisibility(8);
                            }
                        }
                        C34K c34k = new C34K();
                        Switch r3 = this.LLII;
                        if (r3 != null) {
                            r3.setOnTouchListener(new ViewOnTouchListenerC72723SgR(r3, this, c34k));
                        }
                    }
                } else if (this.LJLLJ.getProfileBadge() != null) {
                    if (this.LLIIJLIL.getProfileBadge() != null) {
                        ProfileBadgeStruct profileBadge2 = this.LJLLJ.getProfileBadge();
                        if (profileBadge2 != null) {
                            l = profileBadge2.getId();
                        } else {
                            l = null;
                        }
                        ProfileBadgeStruct profileBadge3 = this.LLIIJLIL.getProfileBadge();
                        if (profileBadge3 != null) {
                            l2 = profileBadge3.getId();
                        } else {
                            l2 = null;
                        }
                        if (o.LJ(l, l2)) {
                            TextView textView5 = this.LLI;
                            if (textView5 != null) {
                                textView5.setVisibility(0);
                            }
                            LinearLayout linearLayout3 = this.LLIFFJFJJ;
                            if (linearLayout3 != null) {
                                linearLayout3.setVisibility(8);
                            }
                            SY4 sy48 = this.LLIIII;
                            if (sy48 != null) {
                                sy48.setVisibility(8);
                            }
                            View view5 = this.LLIIIILZ;
                            if (view5 != null) {
                                view5.setVisibility(0);
                            }
                            View view6 = this.LLIIIJ;
                            if (view6 != null) {
                                view6.setVisibility(0);
                            }
                        }
                    }
                    if (profileBadgeSettingsObject != null) {
                        str = profileBadgeSettingsObject.url;
                    } else {
                        str = null;
                    }
                    if (C78857UxB.LJJJIL(str)) {
                        TextView textView6 = this.LLI;
                        if (textView6 != null) {
                            textView6.setVisibility(0);
                        }
                        LinearLayout linearLayout4 = this.LLIFFJFJJ;
                        if (linearLayout4 != null) {
                            linearLayout4.setVisibility(8);
                        }
                        LJJIJ(this.LJZL, this.LLIIII);
                        View view7 = this.LLIIIILZ;
                        if (view7 != null) {
                            view7.setVisibility(8);
                        }
                        View view8 = this.LLIIIJ;
                        if (view8 != null) {
                            view8.setVisibility(8);
                        }
                        if (profileBadgeSettingsObject != null) {
                            str7 = profileBadgeSettingsObject.ctaAddBadge;
                        }
                        if (C78857UxB.LJJJIL(str7) && (sy42 = this.LLIIII) != null) {
                            sy42.setText(str7);
                        }
                        SY4 sy49 = this.LLIIII;
                        if (sy49 != null) {
                            C16880lQ.LJJIZ(sy49, new ACListenerS30S0300000_4(this, profileBadge, profileBadgeSettingsObject, 23));
                        }
                    } else {
                        try {
                            SettingsManager.LIZLLL().getClass();
                            str2 = SettingsManager.LJI("profile_badge_android_url", "");
                            o.LJIIIIZZ(str2, "{\n            SettingsMa…ng::class.java)\n        }");
                        } catch (Throwable unused) {
                            str2 = "";
                        }
                        if (C78857UxB.LJJJIL(str2)) {
                            TextView textView7 = this.LLI;
                            if (textView7 != null) {
                                textView7.setVisibility(0);
                            }
                            LinearLayout linearLayout5 = this.LLIFFJFJJ;
                            if (linearLayout5 != null) {
                                linearLayout5.setVisibility(8);
                            }
                            LJJIJ(this.LJZL, this.LLIIII);
                            View view9 = this.LLIIIILZ;
                            if (view9 != null) {
                                view9.setVisibility(8);
                            }
                            View view10 = this.LLIIIJ;
                            if (view10 != null) {
                                view10.setVisibility(8);
                            }
                            try {
                                SettingsManager.LIZLLL().getClass();
                                str4 = SettingsManager.LJI("profile_badge_android_cta", "");
                                o.LJIIIIZZ(str4, "{\n            SettingsMa…ng::class.java)\n        }");
                            } catch (Throwable unused2) {
                                str4 = "";
                            }
                            if (str4.length() > 0) {
                                SY4 sy410 = this.LLIIII;
                                if (sy410 != null) {
                                    sy410.setText(str4);
                                }
                            } else {
                                SY4 sy411 = this.LLIIII;
                                if (sy411 != null) {
                                    sy411.setText(getContext().getString(R.string.shj));
                                }
                            }
                            SY4 sy412 = this.LLIIII;
                            if (sy412 != null) {
                                C16880lQ.LJJIZ(sy412, new ACListenerS39S0200000_4(this, profileBadge, 116));
                            }
                        } else {
                            try {
                                SettingsManager.LIZLLL().getClass();
                                str3 = SettingsManager.LJI("create_EOY_video_url", "");
                                o.LJIIIIZZ(str3, "{\n            SettingsMa…ng::class.java)\n        }");
                            } catch (Throwable unused3) {
                                str3 = "";
                            }
                            if (str3.length() > 0) {
                                TextView textView8 = this.LLI;
                                if (textView8 != null) {
                                    textView8.setVisibility(0);
                                }
                                LinearLayout linearLayout6 = this.LLIFFJFJJ;
                                if (linearLayout6 != null) {
                                    linearLayout6.setVisibility(8);
                                }
                                LJJIJ(this.LJZL, this.LLIIII);
                                View view11 = this.LLIIIILZ;
                                if (view11 != null) {
                                    view11.setVisibility(8);
                                }
                                View view12 = this.LLIIIJ;
                                if (view12 != null) {
                                    view12.setVisibility(8);
                                }
                                SY4 sy413 = this.LLIIII;
                                if (sy413 != null) {
                                    C16880lQ.LJJIZ(sy413, new ACListenerS39S0200000_4(this, profileBadge, 115));
                                }
                            } else {
                                TextView textView9 = this.LLI;
                                if (textView9 != null) {
                                    textView9.setVisibility(0);
                                }
                                LinearLayout linearLayout7 = this.LLIFFJFJJ;
                                if (linearLayout7 != null) {
                                    linearLayout7.setVisibility(8);
                                }
                                SY4 sy414 = this.LLIIII;
                                if (sy414 != null) {
                                    sy414.setVisibility(8);
                                }
                                View view13 = this.LLIIIILZ;
                                if (view13 != null) {
                                    view13.setVisibility(0);
                                }
                                View view14 = this.LLIIIJ;
                                if (view14 != null) {
                                    view14.setVisibility(0);
                                }
                            }
                        }
                    }
                } else {
                    TextView textView10 = this.LLI;
                    if (textView10 != null) {
                        textView10.setVisibility(8);
                    }
                    LinearLayout linearLayout8 = this.LLIFFJFJJ;
                    if (linearLayout8 != null) {
                        linearLayout8.setVisibility(8);
                    }
                    SY4 sy415 = this.LLIIII;
                    if (sy415 != null) {
                        sy415.setVisibility(8);
                    }
                    View view15 = this.LLIIIILZ;
                    if (view15 != null) {
                        view15.setVisibility(0);
                    }
                    View view16 = this.LLIIIJ;
                    if (view16 != null) {
                        view16.setVisibility(0);
                    }
                }
                C188727au c188727au2 = new C188727au();
                c188727au2.LJIIIZ("enter_from", this.LLIIL);
                Long id = profileBadge.getId();
                if (id != null) {
                    obj = id;
                }
                c188727au2.LJFF(obj, "badge_id");
                ProfileBadgeStruct profileBadge4 = this.LLIIJLIL.getProfileBadge();
                if (profileBadge4 != null && profileBadge4.getShouldShow()) {
                    str5 = "on";
                } else {
                    str5 = "off";
                }
                c188727au2.LJIIIZ("status", str5);
                FMX.LJIIL("profile_badge_setting", c188727au2.LIZ);
            }
        } else if (C26356AWa.LIZ() && (textView = this.LLI) != null) {
            textView.setVisibility(8);
        }
        boolean LJ = a.LJ().LJ(4);
        LJJIIZ(!LJ);
        ImageView imageView3 = this.LJZ;
        if (imageView3 != null) {
            C16880lQ.LJIILLIIL(imageView3, new ViewOnClickListenerC72726SgU(LJ, this));
        }
        SmartImageView smartImageView3 = this.LJZI;
        if (smartImageView3 != null) {
            C16880lQ.LJJIJLIJ(smartImageView3, new ACListenerS32S0100000_12(this, 200));
        }
        if (this.LJZI != null) {
            if (LJJIIJZLJL()) {
                W5F LJII = W5U.LJII(C78939UyV.LJ(this.LJLLJ.getAvatarVideoUri()));
                LJII.LJJIJIIJIL = true;
                LJII.LIZLLL = true;
                LJII.LJJIIJ = this.LJZI;
                LJII.LIZIZ("AvatarEditableShareDialog");
                C16880lQ.LLJJJ(LJII);
            } else {
                W5F LJII2 = W5U.LJII(C78939UyV.LJ(C78688UuS.LJJI(this.LJLLJ)));
                LJII2.LJJIIJ = this.LJZI;
                LJII2.LIZIZ("AvatarEditableShareDialog");
                C16880lQ.LLJJJ(LJII2);
            }
        }
        if (C26356AWa.LIZ() && (sy4 = this.LJZL) != null) {
            LJJIIZI(sy4);
            C188727au c188727au3 = new C188727au();
            c188727au3.LJIIIZ("enter_method", LJJII());
            c188727au3.LJIIIZ("enter_from", this.LLIIL);
            c188727au3.LJIIIZ("action_type", "show");
            FMX.LJIIL("profile_ai_avatar_entrance", c188727au3.LIZ);
            C16880lQ.LJJIZ(sy4, new ACListenerS24S0100000_4(this, 327));
        }
    }

    @Override // X.InterfaceC72728SgW
    public final void LJIIL(View view, String str) {
        o.LJIIIZ(view, "view");
        this.LLFFF = false;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "profile_photo_page");
        c188727au.LJIIIZ("enter_method", "edit_head");
        c188727au.LJIIIZ("avatar_id", str);
        FMX.LJIIL("edit_avatar", c188727au.LIZ);
        dismiss();
        ProfileNaviServiceImpl.LJIIL().LJ(this.LJLLL, view, str);
    }

    public final void LJJIJ(SY4 sy4, SY4 sy42) {
        if (sy4 == null || sy42 == null) {
            return;
        }
        if (!C26356AWa.LIZ()) {
            sy4.setVisibility(8);
            sy42.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = sy42.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = C7MY.LIZIZ(44);
            sy42.setLayoutParams(layoutParams);
            return;
        }
        LJJIIZI(sy4);
        if (LJJIIJ()) {
            LJJIIZI(sy42);
            C26338AVi.LJI(sy4, null, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4))), null, false, 27);
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", this.LLIIL);
            c188727au.LJIIIZ("action_type", "show");
            FMX.LJIIL("profile_ai_avatar_frame", c188727au.LIZ);
            return;
        }
        sy42.setVisibility(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DialogC72721SgP(User user, Activity activity, AUC auc, C62387Oe7 c62387Oe7) {
        super(activity, R.style.a6u, c62387Oe7);
        String str;
        o.LJIIIZ(user, "user");
        o.LJIIIZ(activity, "activity");
        this.LJLLJ = user;
        this.LJLLL = activity;
        this.LJLLLL = auc;
        this.LJLLLLLL = new C73318Sq2();
        this.LL = (LifecycleOwner) activity;
        this.LLD = (ActivityC45651qj) activity;
        this.LLFF = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1248));
        this.LLFFF = true;
        IProfileBadgeService createIProfileBadgeServicebyMonsterPlugin = ProfileBadgeServiceImpl.createIProfileBadgeServicebyMonsterPlugin(false);
        o.LJIIIIZZ(createIProfileBadgeServicebyMonsterPlugin, "get().getService(IProfileBadgeService::class.java)");
        this.LLIIJI = createIProfileBadgeServicebyMonsterPlugin;
        User curUser = AccountService.LJIJ().LJFF().getCurUser();
        this.LLIIJLIL = curUser;
        if (o.LJ(curUser.getUid(), user.getUid())) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        this.LLIIL = str;
        this.LLIILII = "ProfileWidgetShareDialog";
        this.LLIILZL = new C72727SgV(this);
    }
}
