package com.bytedance.ies.ugc.aweme.commercialize.compliance.advertiser;

import X.AbstractC029409q;
import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C188727au;
import X.C223338pd;
import X.C234529Ii;
import X.C252709vu;
import X.C26227ARb;
import X.C3AW;
import X.C41082GAk;
import X.C65803Ps7;
import X.C9KF;
import X.FMX;
import X.InterfaceC41084GAm;
import X.UC0;
import X.UTU;
import Y.AObserverS75S0100000_7;
import Y.IDFactoryS63S0000000_7;
import Y.IDdS379S0100000_7;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS12S2200000_7;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AdvertiserSettingsActivity extends ActivityC86117Xqz implements InterfaceC41084GAm, View.OnClickListener {
    public C252709vu LJLIL;
    public RecyclerView LJLILLLLZI;
    public RecyclerView LJLJI;
    public C41082GAk LJLJJI;
    public C41082GAk LJLJJL;
    public AdvertiserVM LJLJJLL;
    public C223338pd LJLJL;
    public RelativeLayout LJLJLJ;
    public TuxTextView LJLJLLL;
    public TuxIconView LJLL;
    public String LJLLI;
    public String LJLLILLLL;
    public View LJLLJ;
    public TuxTextView LJLLL;
    public long LJLZ;
    public int LJZI;
    public int LJZL;
    public int LL;
    public int LLD;
    public final Map<Integer, View> LLF = new LinkedHashMap();
    public List<AdvertiserModel> LJLLLL = new ArrayList();
    public List<AdvertiserModel> LJLLLLLL = new ArrayList();
    public int LJZ = -1;

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLF).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLF;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        super.finish();
        List<AdvertiserModel> list = this.LJLLLL;
        if (list != null) {
            for (AdvertiserModel advertiserModel : list) {
                Integer advStatus = advertiserModel.getAdvStatus();
                if (advStatus != null && advStatus.intValue() == 1) {
                    this.LL++;
                }
                Integer advStatus2 = advertiserModel.getAdvStatus();
                if (advStatus2 != null && advStatus2.intValue() == 2) {
                    this.LLD++;
                }
            }
        }
        List<AdvertiserModel> list2 = this.LJLLLLLL;
        if (list2 != null) {
            for (AdvertiserModel advertiserModel2 : list2) {
                Integer advStatus3 = advertiserModel2.getAdvStatus();
                if (advStatus3 != null && advStatus3.intValue() == 1) {
                    this.LL++;
                }
                Integer advStatus4 = advertiserModel2.getAdvStatus();
                if (advStatus4 != null && advStatus4.intValue() == 2) {
                    this.LLD++;
                }
            }
        }
        C188727au c188727au = new C188727au();
        c188727au.LIZLLL(this.LL, "num_toggle_on");
        c188727au.LIZLLL(this.LLD, "num_toggle_off");
        FMX.LJIIL("exit_advertise_settings_page", c188727au.LIZ);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused2) {
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Integer valueOf;
        if (view == null || (valueOf = Integer.valueOf(view.getId())) == null || valueOf.intValue() != R.id.k04) {
            return;
        }
        RecyclerView recyclerView = this.LJLILLLLZI;
        if (recyclerView != null) {
            AbstractC029409q adapter = recyclerView.getAdapter();
            if (adapter != null) {
                if (adapter.getItemCount() > 5) {
                    ArrayList arrayList = new ArrayList();
                    List<AdvertiserModel> list = this.LJLLLL;
                    if (list != null) {
                        int i = 0;
                        for (AdvertiserModel advertiserModel : list) {
                            int i2 = i + 1;
                            if (i == 5) {
                                break;
                            }
                            ListProtector.add(arrayList, i, advertiserModel);
                            i = i2;
                        }
                    }
                    C41082GAk c41082GAk = this.LJLJJI;
                    if (c41082GAk != null) {
                        c41082GAk.LJLILLLLZI = arrayList;
                        C41082GAk c41082GAk2 = this.LJLJJI;
                        if (c41082GAk2 != null) {
                            c41082GAk2.notifyDataSetChanged();
                            TuxTextView tuxTextView = this.LJLJLLL;
                            if (tuxTextView != null) {
                                tuxTextView.setText(this.LJLLI);
                            }
                            TuxIconView tuxIconView = this.LJLL;
                            if (tuxIconView == null) {
                                return;
                            }
                            tuxIconView.setRotation(360.0f);
                            return;
                        }
                        o.LJIJI("shownAdapter");
                        throw null;
                    }
                    o.LJIJI("shownAdapter");
                    throw null;
                }
                List<AdvertiserModel> list2 = this.LJLLLL;
                if (list2 == null) {
                    return;
                }
                C41082GAk c41082GAk3 = this.LJLJJI;
                if (c41082GAk3 != null) {
                    c41082GAk3.LJLILLLLZI = list2;
                    C41082GAk c41082GAk4 = this.LJLJJI;
                    if (c41082GAk4 != null) {
                        c41082GAk4.notifyDataSetChanged();
                        TuxTextView tuxTextView2 = this.LJLJLLL;
                        if (tuxTextView2 != null) {
                            tuxTextView2.setText(this.LJLLILLLL);
                        }
                        TuxIconView tuxIconView2 = this.LJLL;
                        if (tuxIconView2 == null) {
                            return;
                        }
                        tuxIconView2.setRotation(180.0f);
                        return;
                    }
                    o.LJIJI("shownAdapter");
                    throw null;
                }
                o.LJIJI("shownAdapter");
                throw null;
            }
            return;
        }
        o.LJIJI("shownRecyclerView");
        throw null;
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        AdvertiserVM advertiserVM = (AdvertiserVM) ViewModelProviders.of(this, new IDFactoryS63S0000000_7(0)).get(AdvertiserVM.class);
        this.LJLJJLL = advertiserVM;
        if (advertiserVM != null) {
            if (!UTU.LIZIZ(UTU.LIZ)) {
                advertiserVM.LJLIL.getAdvertiserList().enqueue(new IDdS379S0100000_7(advertiserVM, 1));
            }
            AdvertiserVM advertiserVM2 = this.LJLJJLL;
            if (advertiserVM2 != null) {
                advertiserVM2.LJLILLLLZI.observe(this, new AObserverS75S0100000_7(this, 60));
                activityConfiguration(new AqS173S0100000_7(this, 34));
                super.onCreate(bundle);
                setContentView(R.layout.afq);
                View findViewById = findViewById(R.id.yc);
                o.LJIIIIZZ(findViewById, "findViewById(R.id.advert…er_settings_title_layout)");
                C252709vu c252709vu = (C252709vu) findViewById;
                this.LJLIL = c252709vu;
                C9KF c9kf = new C9KF();
                String string = getString(R.string.v7);
                o.LJIIIIZZ(string, "getString(R.string.Setti…s_page_advsettings_title)");
                c9kf.LIZJ = string;
                c252709vu.LJIILLIIL(c9kf);
                C252709vu c252709vu2 = this.LJLIL;
                if (c252709vu2 != null) {
                    C234529Ii LIZJ = s1.LIZJ();
                    LIZJ.LIZJ = R.raw.icon_arrow_left_ltr;
                    String string2 = getString(R.string.aub);
                    o.LJIIIIZZ(string2, "getString(R.string.acces…lityLabels_settings_back)");
                    LIZJ.LJII = string2;
                    LIZJ.LIZIZ(new AqS157S0100000_7(this, 468));
                    c252709vu2.LIZJ(LIZJ);
                    C252709vu c252709vu3 = this.LJLIL;
                    if (c252709vu3 != null) {
                        c252709vu3.LJIILJJIL(true);
                        View findViewById2 = findViewById(R.id.k07);
                        o.LJIIIIZZ(findViewById2, "findViewById(R.id.shown_advertiser_list)");
                        this.LJLILLLLZI = (RecyclerView) findViewById2;
                        View findViewById3 = findViewById(R.id.e57);
                        o.LJIIIIZZ(findViewById3, "findViewById(R.id.hidden_advertiser_list)");
                        this.LJLJI = (RecyclerView) findViewById3;
                        this.LJLJLJ = (RelativeLayout) findViewById(R.id.k04);
                        this.LJLJLLL = (TuxTextView) findViewById(R.id.k05);
                        this.LJLL = (TuxIconView) findViewById(R.id.k03);
                        this.LJLJL = (C223338pd) findViewById(R.id.g8p);
                        this.LJLLJ = findViewById(R.id.ka5);
                        this.LJLLL = (TuxTextView) findViewById(R.id.ka9);
                        this.LJLLI = C16880lQ.LLLLLJIL(this).getString(R.string.i7);
                        this.LJLLILLLL = C16880lQ.LLLLLJIL(this).getString(R.string.i9);
                        C223338pd c223338pd = this.LJLJL;
                        if (c223338pd != null) {
                            c223338pd.setVisibility(0);
                        }
                        C223338pd c223338pd2 = this.LJLJL;
                        if (c223338pd2 != null) {
                            c223338pd2.LIZIZ();
                        }
                        AdvertiserVM advertiserVM3 = this.LJLJJLL;
                        if (advertiserVM3 != null) {
                            advertiserVM3.LJLJI.observe(this, new AObserverS75S0100000_7(this, 61));
                            return;
                        } else {
                            o.LJIJI("advertiserVM");
                            throw null;
                        }
                    }
                    o.LJIJI("title");
                    throw null;
                }
                o.LJIJI("title");
                throw null;
            }
            o.LJIJI("advertiserVM");
            throw null;
        }
        o.LJIJI("advertiserVM");
        throw null;
    }

    @Override // X.InterfaceC41084GAm
    public final void LJLILLLLZI(int i, AdvertiserModel advertiser) {
        o.LJIIIZ(advertiser, "advertiser");
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.LJLZ < 500) {
            return;
        }
        this.LJLZ = currentTimeMillis;
        if (i < 0) {
            return;
        }
        this.LJZ = i;
        Integer advStatus = advertiser.getAdvStatus();
        if (advStatus == null || advStatus.intValue() != 1) {
            AdvertiserVM advertiserVM = this.LJLJJLL;
            if (advertiserVM != null) {
                advertiserVM.gv0(advertiser);
                return;
            } else {
                o.LJIJI("advertiserVM");
                throw null;
            }
        }
        String string = C16880lQ.LLLLLJIL(this).getString(R.string.ia);
        o.LJIIIIZZ(string, "applicationContext.getSt…dv_settings_warning_text)");
        String string2 = C16880lQ.LLLLLJIL(this).getString(R.string.i_);
        o.LJIIIIZZ(string2, "applicationContext.getSt…ings_warning_description)");
        String string3 = C16880lQ.LLLLLJIL(this).getString(R.string.i8);
        o.LJIIIIZZ(string3, "applicationContext.getSt…tings_warning_CTA_cancel)");
        String string4 = C16880lQ.LLLLLJIL(this).getString(R.string.i9);
        o.LJIIIIZZ(string4, "applicationContext.getSt…ings_warning_CTA_proceed)");
        if (TextUtils.isEmpty(advertiser.getAdvWebsite())) {
            String advName = advertiser.getAdvName();
            if (advName != null) {
                string = ujb.o.LJJJJZ(string, "%s", advName, false);
            }
        } else {
            String advWebsite = advertiser.getAdvWebsite();
            if (advWebsite != null) {
                string = ujb.o.LJJJJZ(string, "%s", advWebsite, false);
            }
        }
        C26227ARb LIZ = C3AW.LIZ(this);
        LIZ.LJFF(string);
        LIZ.LIZIZ(string2);
        UC0.LIZJ(LIZ, new AqS12S2200000_7(string4, string3, this, advertiser, 0));
        LIZ.LJI().LIZLLL();
    }
}
