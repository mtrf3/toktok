package X;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.OWj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62037OWj extends PagerAdapter {
    public final java.util.Map<Integer, Integer> LJLILLLLZI = C51029K0z.LJJIIZI(new OSZ(0, Integer.valueOf(R.layout.cm8)));
    public final HashMap<Integer, Boolean> LJLJI = new HashMap<>();
    public final HashMap<Integer, View> LJLJJI = new HashMap<>();
    public final ArrayList<String> LJLJJL = C47261Igj.LJII("BN", "FI", "GU", "HI", "HU", "JA", "MR", "MY", "TR", "UR", "UZ");

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJIIZILJ(View view, Object object) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(object, "object");
        return view == object;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LJLILLLLZI.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJIILLIIL(int i, ViewGroup container) {
        o.LJIIIZ(container, "container");
        Integer num = this.LJLILLLLZI.get(Integer.valueOf(i));
        LayoutInflater LLZIL = C16880lQ.LLZIL(container.getContext());
        o.LJI(num);
        View item = C16880lQ.LLLLIILL(LLZIL, num.intValue(), container, false);
        container.addView(item);
        Integer valueOf = Integer.valueOf(i);
        HashMap<Integer, View> hashMap = this.LJLJJI;
        o.LJIIIIZZ(item, "item");
        hashMap.put(valueOf, item);
        View findViewById = item.findViewById(R.id.my0);
        o.LJIIIIZZ(findViewById, "rootView.findViewById(R.id.user_avatar)");
        C57127MbT c57127MbT = (C57127MbT) findViewById;
        View findViewById2 = item.findViewById(R.id.mjt);
        o.LJIIIIZZ(findViewById2, "rootView.findViewById(R.id.tv_share_now_user_id)");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = item.findViewById(R.id.mjr);
        o.LJIIIIZZ(findViewById3, "rootView.findViewById(R.id.tv_share_now_content)");
        TuxTextView tuxTextView = (TuxTextView) findViewById3;
        View findViewById4 = item.findViewById(R.id.efy);
        o.LJIIIIZZ(findViewById4, "rootView.findViewById(R.…share_now_invite_card_bg)");
        View findViewById5 = item.findViewById(R.id.mjs);
        o.LJIIIIZZ(findViewById5, "rootView.findViewById(R.…e_now_content_tiktok_now)");
        TuxTextView tuxTextView2 = (TuxTextView) findViewById5;
        C82802Wec LIZIZ = UgCommonServiceImpl.LJIJ().LIZIZ();
        C62039OWl c62039OWl = new C62039OWl((ImageView) findViewById4, tuxTextView2);
        LIZIZ.getClass();
        C82802Wec.LJ("invite_card_new_style", Bitmap.class, c62039OWl);
        ArrayList<String> arrayList = this.LJLJJL;
        String language = EF7.LIZIZ().getResources().getConfiguration().locale.getLanguage();
        o.LJIIIIZZ(language, "AppContextManager.getApp…iguration.locale.language");
        String upperCase = language.toUpperCase(Locale.ROOT);
        o.LJIIIIZZ(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        if (arrayList.contains(upperCase)) {
            tuxTextView.setText(EF7.LIZIZ().getString(R.string.t2m));
        } else {
            tuxTextView.setText(EF7.LIZIZ().getString(R.string.t2l));
        }
        UgCommonServiceImpl.LJIJ().LIZIZ().getClass();
        if (C82802Wec.LIZLLL(Bitmap.class, "invite_card_new_style") == null) {
            tuxTextView2.setVisibility(0);
        }
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        o.LJIIIIZZ(curUser, "userService().curUser");
        c57127MbT.LJIIIIZZ(curUser.getAvatarThumb(), null, c57127MbT.getWidth(), c57127MbT.getWidth(), "", true, null);
        tuxTextView.LJJJ(26.0f);
        String uniqueId = curUser.getUniqueId();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('@');
        LIZ.append(uniqueId);
        textView.setText(X1D.LIZIZ(LIZ));
        return item;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIIZ(int i, ViewGroup container, Object object) {
        o.LJIIIZ(container, "container");
        o.LJIIIZ(object, "object");
        C16880lQ.LJLLL((View) object, container);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIL(int i, ViewGroup container, Object object) {
        View view;
        C62398OeI c62398OeI;
        String str;
        BaseSharePackage baseSharePackage;
        Bundle bundle;
        String str2;
        UrlModel urlModel;
        List<String> urlList;
        o.LJIIIZ(container, "container");
        o.LJIIIZ(object, "object");
        View view2 = this.LJLJJI.get(Integer.valueOf(i));
        UrlModel urlModel2 = null;
        if (view2 != null) {
            view = view2.findViewById(R.id.efx);
        } else {
            view = null;
        }
        C62038OWk.LIZLLL = i;
        C62038OWk.LJ = new WeakReference<>(view);
        C62387Oe7 c62387Oe7 = C62038OWk.LIZ;
        if (c62387Oe7 != null && (baseSharePackage = c62387Oe7.LJIIJ) != null && (bundle = baseSharePackage.extras) != null) {
            C62398OeI c62398OeI2 = C62038OWk.LIZIZ;
            if (c62398OeI2 != null && (urlModel = c62398OeI2.LJI) != null && (urlList = urlModel.getUrlList()) != null && (!urlList.isEmpty())) {
                if (C62038OWk.LIZLLL <= urlList.size()) {
                    str2 = (String) ListProtector.get(urlList, C62038OWk.LIZLLL);
                } else {
                    str2 = (String) ListProtector.get(urlList, 0);
                }
            } else {
                str2 = null;
            }
            bundle.putString("thumb_url", str2);
            C62398OeI c62398OeI3 = C62038OWk.LIZIZ;
            if (c62398OeI3 != null) {
                urlModel2 = c62398OeI3.LJI;
            }
            bundle.putSerializable("thumb_for_share", urlModel2);
        }
        Boolean bool = this.LJLJI.get(Integer.valueOf(i));
        Boolean bool2 = Boolean.TRUE;
        if (!(!o.LJ(bool, bool2)) || (c62398OeI = C62038OWk.LIZIZ) == null || (str = c62398OeI.LIZLLL) == null) {
            return;
        }
        this.LJLJI.put(Integer.valueOf(i), bool2);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("card_type", "black");
        FMX.LJIIL("now_invite_card", c188727au.LIZ);
    }
}
