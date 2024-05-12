package com.ss.android.ugc.trill.setting;

import X.AB1;
import X.AB2;
import X.AB6;
import X.AB8;
import X.ABA;
import X.ABX;
import X.AbstractC234519Ih;
import X.C109824Ss;
import X.C188727au;
import X.C221108m2;
import X.C234509Ig;
import X.C235119Kp;
import X.C252709vu;
import X.C47261Igj;
import X.C53150KtW;
import X.C62822Ol8;
import X.C79004UzY;
import X.C79045V0n;
import X.C7MY;
import X.C9KF;
import X.EnumC252729vw;
import X.FMX;
import X.InterfaceC61213O0r;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import defpackage.t1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes5.dex */
public final class TranslationLanguageSettingPage extends BasePage implements Observer<ArrayList<ABA>>, AB6 {
    public static Intent LJLLL;
    public static String LJLLLL = "";
    public C252709vu LJLJI;
    public RecyclerView LJLJJI;
    public TranslationLanguageViewModel LJLJJL;
    public AB8 LJLJJLL;
    public final Map<Integer, View> LJLLJ = new LinkedHashMap();
    public int LJLJL = -1;
    public int LJLJLJ = -1;
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 991));
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 990));
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 989));
    public final C62822Ol8 LJLLILLLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 988));

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLJ).clear();
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLJ;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final int getLayout() {
        return R.layout.cli;
    }

    public final C252709vu Al() {
        C252709vu c252709vu = this.LJLJI;
        if (c252709vu != null) {
            return c252709vu;
        }
        o.LJIJI("mBtnFinish");
        throw null;
    }

    @Override // X.AB6
    public final void LJJIFFI(int i) {
        if (i == this.LJLJLJ) {
            return;
        }
        if (i == this.LJLJL) {
            Al().LJIJ("end_text", AB1.LJLIL);
        } else {
            Al().LJIJ("end_text", AB2.LJLIL);
        }
        TranslationLanguageViewModel translationLanguageViewModel = this.LJLJJL;
        if (translationLanguageViewModel != null) {
            int i2 = this.LJLJLJ;
            MutableLiveData<ArrayList<ABA>> mutableLiveData = translationLanguageViewModel.LJLIL;
            if (mutableLiveData != null && !C79004UzY.LJJIFFI(mutableLiveData.getValue())) {
                if (i2 >= 0) {
                    ArrayList<ABA> value = mutableLiveData.getValue();
                    o.LJI(value);
                    ((ABA) ListProtector.get(value, i2)).LIZ = false;
                }
                ArrayList<ABA> value2 = mutableLiveData.getValue();
                o.LJI(value2);
                ((ABA) ListProtector.get(value2, i)).LIZ = true;
            }
        }
        this.LJLJLJ = i;
        AB8 ab8 = this.LJLJJLL;
        if (ab8 != null) {
            ab8.notifyDataSetChanged();
        }
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(ArrayList<ABA> arrayList) {
        AB8 ab8;
        ArrayList<ABA> arrayList2 = arrayList;
        if (C79004UzY.LJJIFFI(arrayList2)) {
            return;
        }
        AB8 ab82 = this.LJLJJLL;
        if (ab82 == null) {
            Context context = getContext();
            if (context != null) {
                ab8 = new AB8(context, this);
            } else {
                ab8 = null;
            }
            this.LJLJJLL = ab8;
            if (ab8 != null) {
                ab8.LJLJI = arrayList2;
            }
            RecyclerView recyclerView = this.LJLJJI;
            if (recyclerView != null) {
                recyclerView.setAdapter(ab8);
                return;
            } else {
                o.LJIJI("mTranslationListLanguageView");
                throw null;
            }
        }
        ab82.LJLJI = arrayList2;
        ab82.notifyDataSetChanged();
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        List list;
        this.LJLJI = (C252709vu) C7MY.LIZLLL(view, "view", R.id.l_2, "view.findViewById(R.id.title_bar)");
        View findViewById = view.findViewById(R.id.fu6);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.list_language)");
        this.LJLJJI = (RecyclerView) findViewById;
        super.onViewCreated(view, bundle);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("user_id", BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser().getUid());
        c188727au.LJIIIZ("enter_method", (String) this.LJLLI.getValue());
        c188727au.LJIIIZ("enter_from", (String) this.LJLLILLLL.getValue());
        c188727au.LJIIIZ("target_lang", LJLLLL);
        FMX.LJIIL("enter_transl_lang", c188727au.LIZ);
        TranslationLanguageViewModel translationLanguageViewModel = (TranslationLanguageViewModel) ViewModelProviders.of(this).get(TranslationLanguageViewModel.class);
        this.LJLJJL = translationLanguageViewModel;
        if (translationLanguageViewModel != null) {
            if (translationLanguageViewModel.LJLIL == null) {
                translationLanguageViewModel.LJLIL = new MutableLiveData<>();
            }
            MutableLiveData<ArrayList<ABA>> mutableLiveData = translationLanguageViewModel.LJLIL;
            o.LJI(mutableLiveData);
            mutableLiveData.observe(this, this);
        }
        if (this.LJLJLLL.getValue() == null || ((list = (List) this.LJLJLLL.getValue()) != null && list.isEmpty())) {
            vl();
        }
        TranslationLanguageViewModel translationLanguageViewModel2 = this.LJLJJL;
        int i = -1;
        if (translationLanguageViewModel2 != null) {
            List list2 = (List) this.LJLJLLL.getValue();
            String str2 = (String) this.LJLL.getValue();
            ArrayList<ABA> arrayList = new ArrayList<>();
            if (list2 != null) {
                int i2 = 0;
                for (Object obj : list2) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        ContentLanguage contentLanguage = (ContentLanguage) obj;
                        if (ujb.o.LJJJJIZL(str2, contentLanguage.getLanguageCode(), false)) {
                            arrayList.add(new ABA(new ABX("", contentLanguage.getEnglishName(), contentLanguage.getLanguageCode(), contentLanguage.getLocalName()), true));
                            i = i2;
                        } else {
                            arrayList.add(new ABA(new ABX("", contentLanguage.getEnglishName(), contentLanguage.getLanguageCode(), contentLanguage.getLocalName()), false));
                        }
                        i2 = i3;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }
            MutableLiveData<ArrayList<ABA>> mutableLiveData2 = translationLanguageViewModel2.LJLIL;
            if (mutableLiveData2 != null) {
                mutableLiveData2.postValue(arrayList);
            }
        }
        this.LJLJL = i;
        this.LJLJLJ = i;
        RecyclerView recyclerView = this.LJLJJI;
        if (recyclerView != null) {
            getContext();
            recyclerView.setLayoutManager(new WrapLinearLayoutManager());
            if (C53150KtW.LIZ()) {
                str = getString(R.string.daq);
            } else {
                str = "Translation Language";
            }
            o.LJIIIIZZ(str, "if (CLACombineCaptionEnt…ation Language\"\n        }");
            C252709vu Al = Al();
            C235119Kp c235119Kp = new C235119Kp();
            C234509Ig c234509Ig = new C234509Ig();
            c234509Ig.LIZIZ = "start_text";
            String string = getString(R.string.cel);
            o.LJIIIIZZ(string, "getString(R.string.button_cancel)");
            c234509Ig.LIZJ = string;
            c234509Ig.LIZ = new C109824Ss(new AqS154S0100000_4(this, 1255));
            C9KF LIZLLL = t1.LIZLLL(c235119Kp, new AbstractC234519Ih[]{c234509Ig});
            LIZLLL.LIZJ = str;
            c235119Kp.LIZJ = LIZLLL;
            C234509Ig c234509Ig2 = new C234509Ig();
            c234509Ig2.LIZIZ = "end_text";
            String string2 = getString(R.string.gi1);
            o.LJIIIIZZ(string2, "getString(R.string.finish)");
            c234509Ig2.LIZJ = string2;
            c234509Ig2.LJ = false;
            c234509Ig2.LIZ(EnumC252729vw.SECONDARY);
            c234509Ig2.LIZ = new C109824Ss(new AqS154S0100000_4(this, 1256));
            c235119Kp.LIZIZ(c234509Ig2);
            Al.setNavActions(c235119Kp);
            Context requireContext = requireContext();
            o.LJIIIIZZ(requireContext, "requireContext()");
            Integer LJI = C79045V0n.LJI(R.attr.c9, requireContext);
            if (LJI != null) {
                int intValue = LJI.intValue();
                View view2 = getView();
                if (view2 != null) {
                    view2.setBackgroundColor(intValue);
                }
                Al().setNavBackground(intValue);
                return;
            }
            return;
        }
        o.LJIJI("mTranslationListLanguageView");
        throw null;
    }
}
