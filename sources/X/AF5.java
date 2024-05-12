package X;

import X.AF1;
import X.AF5;
import Y.ACListenerS39S0200000_4;
import Y.AObserverS72S0100000_4;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.contentlanguage.ContentLanguageServiceImpl;
import com.ss.android.ugc.aweme.contentlanguage.viewmodel.ContentPreferenceViewModel;
import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AF5 extends AbstractC029409q<RecyclerView.ViewHolder> implements LifecycleOwner, AF2 {
    public final Activity LJLIL;
    public ArrayList<ContentLanguage> LJLILLLLZI = new ArrayList<>();
    public final ContentPreferenceViewModel LJLJI;
    public final AF1 LJLJJI;

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }

    @Override // X.AF2
    public final void vY(Throwable th) {
    }

    @Override // X.AF2
    public final void LLJJ() {
        ContentPreferenceViewModel contentPreferenceViewModel = this.LJLJI;
        o.LJI(contentPreferenceViewModel);
        ArrayList<ContentLanguage> value = contentPreferenceViewModel.hv0().getValue();
        o.LJI(value);
        int size = value.size();
        String str = "";
        for (int i = 0; i < size; i++) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            ArrayList<ContentLanguage> value2 = this.LJLJI.hv0().getValue();
            o.LJI(value2);
            LIZ.append(((ContentLanguage) ListProtector.get(value2, i)).getLanguageCode());
            LIZ.append(',');
            str = X1D.LIZIZ(LIZ);
        }
        SharePrefCache.inst().getUserAddLanguages().LIZLLL(str);
        ContentLanguageServiceImpl.LJIIJJI().LJIIIZ();
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        int i;
        ArrayList<ContentLanguage> arrayList = this.LJLILLLLZI;
        if (arrayList != null) {
            Integer valueOf = Integer.valueOf(arrayList.size());
            o.LJI(valueOf);
            i = valueOf.intValue();
        } else {
            i = 0;
        }
        return i + 1;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        ComponentCallbacks2 componentCallbacks2 = this.LJLIL;
        o.LJII(componentCallbacks2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        Lifecycle lifecycle = ((LifecycleOwner) componentCallbacks2).getLifecycle();
        o.LJIIIIZZ(lifecycle, "mActivity as LifecycleOwner).lifecycle");
        return lifecycle;
    }

    public AF5(ActivityC45651qj activityC45651qj) {
        this.LJLIL = activityC45651qj;
        ContentPreferenceViewModel contentPreferenceViewModel = (ContentPreferenceViewModel) ViewModelProviders.of(activityC45651qj).get(ContentPreferenceViewModel.class);
        this.LJLJI = contentPreferenceViewModel;
        contentPreferenceViewModel.hv0().observe(this, new AObserverS72S0100000_4(this, 35));
        AF1 af1 = new AF1();
        this.LJLJJI = af1;
        af1.LIZJ = this;
        activityC45651qj.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.contentlanguage.ContentLanguageAdapter$2
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_RESUME) {
                    onResume();
                } else if (event == Lifecycle.Event.ON_DESTROY) {
                    onDestroy();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public final void onDestroy() {
                AF1 af12 = AF5.this.LJLJJI;
                if (af12 != null) {
                    o.LJI(af12);
                    af12.LIZ.LIZLLL();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
            public final void onResume() {
                AF5 af5 = AF5.this;
                ContentPreferenceViewModel contentPreferenceViewModel2 = af5.LJLJI;
                if (contentPreferenceViewModel2 != null) {
                    af5.LJLILLLLZI = contentPreferenceViewModel2.hv0().getValue();
                    AF5.this.notifyDataSetChanged();
                }
            }
        });
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder vh, int i) {
        o.LJIIIZ(vh, "vh");
        if (getItemCount() != 1 && (vh instanceof AF6)) {
            ArrayList<ContentLanguage> arrayList = this.LJLILLLLZI;
            o.LJI(arrayList);
            Object obj = ListProtector.get(arrayList, i - 1);
            o.LJIIIIZZ(obj, "mLanguageItems!![finalPosition]");
            ContentLanguage contentLanguage = (ContentLanguage) obj;
            if (contentLanguage.getLocalName() == null) {
                return;
            }
            AF6 af6 = (AF6) vh;
            af6.LJLIL.setTitle(contentLanguage.getLocalName());
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_trash_bin;
            af6.LJLIL.setIcon(c2068389v);
            af6.LJLIL.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS39S0200000_4(this, contentLanguage, 81)));
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        RecyclerView.ViewHolder af6;
        o.LJIIIZ(parent, "parent");
        if (i == 0) {
            af6 = new AF7(C28289B8j.LIZ(parent, R.layout.bhv, parent, false));
        } else {
            af6 = new AF6(C1FL.LIZIZ(parent, R.layout.bb0, parent, false, "from(parent.context).inf…_language, parent, false)"));
        }
        C0AX.LIZ(parent, af6.itemView, R.id.lj7);
        View view = af6.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (af6.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(af6.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) af6.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(af6.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = af6.getClass().getName();
        return af6;
    }
}
