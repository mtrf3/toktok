package com.bytedance.ies.ugc.aweme.commercialize.compliance.inference;

import X.ASL;
import X.ActivityC45651qj;
import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C188727au;
import X.C1DG;
import X.C234529Ii;
import X.C252709vu;
import X.C32151Nz;
import X.C38891fp;
import X.C65803Ps7;
import X.C71945SLl;
import X.C781835a;
import X.C78580Usi;
import X.C85516XhI;
import X.C9KF;
import X.FMX;
import X.GKJ;
import X.InterfaceC85518XhK;
import X.O6R;
import Y.ACListenerS35S0100000_15;
import Y.AObserverS83S0100000_15;
import Y.IDDListenerS154S0100000_15;
import Y.IDFactoryS63S0000000_7;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.api.ICommercializeComplianceApi;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.inference.model.Gender;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.inference.model.LabelData;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.inference.ui.LabelDialog;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.inference.viewmodel.InferenceCategoryVM;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import defpackage.s1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class AdInferenceActivity extends ActivityC86117Xqz implements InterfaceC85518XhK {
    public C252709vu LJLIL;
    public RecyclerView LJLILLLLZI;
    public C85516XhI LJLJI;
    public InferenceCategoryVM LJLJJI;
    public LabelDialog LJLJJL;
    public RelativeLayout LJLJJLL;
    public RelativeLayout LJLJL;
    public RelativeLayout LJLJLJ;
    public TuxIconView LJLJLLL;
    public TuxIconView LJLL;
    public TuxTextView LJLLI;
    public String LJLLILLLL;
    public String LJLLJ;
    public Gender LJLLL;
    public String LJZ;
    public String LJZI;
    public int LL;
    public int LLD;
    public boolean LLF;
    public long LLFF;
    public long LLFFF;
    public final Map<Integer, View> LLFZ = new LinkedHashMap();
    public List<LabelData> LJLLLL = new ArrayList();
    public List<LabelData> LJLLLLLL = new ArrayList();
    public List<LabelData> LJLZ = new ArrayList();
    public int LJZL = -1;
    public final long LLFII = 500;

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLFZ).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLFZ;
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
        this.LLD = ((ArrayList) this.LJLLLL).size();
        boolean z = this.LLF;
        C188727au c188727au = new C188727au();
        c188727au.LJ(System.currentTimeMillis() - this.LLFF, "page_stay_time");
        c188727au.LIZLLL(this.LL, "initial_active_interest");
        c188727au.LIZLLL(this.LLD, "final_active_interest");
        c188727au.LIZLLL(z ? 1 : 0, "change_interest");
        FMX.LJIIL("exit_ad_inference", c188727au.LIZ);
        super.finish();
    }

    public static boolean LLFZ() {
        String LIZIZ = C71945SLl.LIZIZ();
        if (LIZIZ == null) {
            return false;
        }
        String LJFF = i0.LJFF("show", LIZIZ);
        Keva keva = C781835a.LIZ;
        boolean z = keva.getBoolean(LJFF, false);
        long LIZIZ2 = C78580Usi.LIZIZ("time", LIZIZ, keva, 0L);
        if (z && (System.currentTimeMillis() - LIZIZ2) / 86400000 <= 35) {
            return false;
        }
        return true;
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

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        C65803Ps7.LIZ(this, bundle);
        InferenceCategoryVM inferenceCategoryVM = (InferenceCategoryVM) ViewModelProviders.of(this, new IDFactoryS63S0000000_7(2)).get(InferenceCategoryVM.class);
        this.LJLJJI = inferenceCategoryVM;
        if (inferenceCategoryVM != null) {
            inferenceCategoryVM.gv0();
            LabelDialog labelDialog = new LabelDialog();
            labelDialog.LJLILLLLZI = this;
            labelDialog.LJLJI = (InferenceCategoryVM) ViewModelProviders.of(this, new IDFactoryS63S0000000_7(2)).get(InferenceCategoryVM.class);
            ICommercializeComplianceApi.LIZ.getClass();
            labelDialog.LJLJJI = GKJ.LIZ();
            this.LJLJJL = labelDialog;
            InferenceCategoryVM inferenceCategoryVM2 = this.LJLJJI;
            if (inferenceCategoryVM2 != null) {
                inferenceCategoryVM2.LJLIL.observe(this, new AObserverS83S0100000_15(this, 86));
                this.LLFF = System.currentTimeMillis();
                C188727au c188727au = new C188727au();
                c188727au.LIZLLL(LLFZ() ? 1 : 0, "show_feedback");
                FMX.LJIIL("show_ad_inference", c188727au.LIZ);
                activityConfiguration(new AqS173S0100000_7(this, 35));
                super.onCreate(bundle);
                setContentView(R.layout.afs);
                View findViewById = findViewById(R.id.ell);
                o.LJIIIIZZ(findViewById, "findViewById(R.id.inference_title_layout)");
                C252709vu c252709vu = (C252709vu) findViewById;
                this.LJLIL = c252709vu;
                C9KF c9kf = new C9KF();
                String string = getString(R.string.qze);
                o.LJIIIIZZ(string, "getString(R.string.setti…ization_granular_control)");
                c9kf.LIZJ = string;
                c252709vu.LJIILLIIL(c9kf);
                C252709vu c252709vu2 = this.LJLIL;
                if (c252709vu2 != null) {
                    C234529Ii LIZJ = s1.LIZJ();
                    LIZJ.LIZJ = R.raw.icon_arrow_left_ltr;
                    String string2 = getString(R.string.aub);
                    o.LJIIIIZZ(string2, "getString(R.string.acces…lityLabels_settings_back)");
                    LIZJ.LJII = string2;
                    LIZJ.LIZIZ(new AqS165S0100000_15(this, 812));
                    c252709vu2.LIZJ(LIZJ);
                    C252709vu c252709vu3 = this.LJLIL;
                    if (c252709vu3 != null) {
                        c252709vu3.LJIILJJIL(true);
                        View findViewById2 = findViewById(R.id.mz7);
                        o.LJIIIIZZ(findViewById2, "findViewById(R.id.user_label_list)");
                        this.LJLILLLLZI = (RecyclerView) findViewById2;
                        this.LJLLI = (TuxTextView) findViewById(R.id.r7);
                        Context applicationContext = getApplicationContext();
                        if (C38891fp.LJLJI && applicationContext == null) {
                            applicationContext = C38891fp.LJLILLLLZI;
                        }
                        this.LJLLILLLL = applicationContext.getString(R.string.b9e);
                        Context applicationContext2 = getApplicationContext();
                        if (C38891fp.LJLJI && applicationContext2 == null) {
                            applicationContext2 = C38891fp.LJLILLLLZI;
                        }
                        String string3 = applicationContext2.getString(R.string.b9d);
                        this.LJLLJ = string3;
                        if (string3 != null && !ujb.o.LJJJJJL(string3)) {
                            String str2 = this.LJLLILLLL;
                            if (str2 != null) {
                                str = ujb.o.LJJJJZ(str2, "%s", string3, false);
                            } else {
                                str = null;
                            }
                            this.LJLLILLLL = str;
                        }
                        if (LLFZ()) {
                            this.LJLJJLL = (RelativeLayout) findViewById(R.id.ele);
                            this.LJLJL = (RelativeLayout) findViewById(R.id.elc);
                            this.LJLJLJ = (RelativeLayout) findViewById(R.id.elg);
                            this.LJLJLLL = (TuxIconView) findViewById(R.id.elf);
                            this.LJLL = (TuxIconView) findViewById(R.id.eld);
                            RelativeLayout relativeLayout = this.LJLJJLL;
                            if (relativeLayout != null) {
                                relativeLayout.setVisibility(0);
                            }
                            TuxIconView tuxIconView = this.LJLJLLL;
                            if (tuxIconView != null) {
                                C16880lQ.LJJJ(tuxIconView, new ACListenerS35S0100000_15(this, 209));
                            }
                            TuxIconView tuxIconView2 = this.LJLL;
                            if (tuxIconView2 != null) {
                                C16880lQ.LJJJ(tuxIconView2, new ACListenerS35S0100000_15(this, 210));
                            }
                        }
                        InferenceCategoryVM inferenceCategoryVM3 = this.LJLJJI;
                        if (inferenceCategoryVM3 != null) {
                            inferenceCategoryVM3.LJLILLLLZI.observe(this, new AObserverS83S0100000_15(this, 87));
                            return;
                        } else {
                            o.LJIJI("inferenceVM");
                            throw null;
                        }
                    }
                    o.LJIJI("mTitle");
                    throw null;
                }
                o.LJIJI("mTitle");
                throw null;
            }
            o.LJIJI("inferenceVM");
            throw null;
        }
        o.LJIJI("inferenceVM");
        throw null;
    }

    @Override // X.InterfaceC85518XhK
    public final void onItemClick(int i) {
        String interestTagId;
        Integer valueOf;
        if (i >= 0 && i < ((ArrayList) this.LJLZ).size()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.LLFFF < this.LLFII) {
                return;
            }
            this.LLFFF = currentTimeMillis;
            int labelType = ((LabelData) ListProtector.get(this.LJLZ, i)).getLabelType();
            if (labelType != 0) {
                if (labelType != 1) {
                    if (labelType == 2) {
                        this.LJZL = ((ArrayList) this.LJLLLLLL).indexOf(ListProtector.get(this.LJLZ, i));
                    }
                } else {
                    this.LJZL = ((ArrayList) this.LJLLLL).indexOf(ListProtector.get(this.LJLZ, i));
                }
            } else {
                this.LJZL = 0;
            }
            LabelDialog labelDialog = this.LJLJJL;
            if (labelDialog != null) {
                LabelData labelData = (LabelData) ListProtector.get(this.LJLZ, i);
                String str = this.LJZI;
                o.LJIIIZ(labelData, "labelData");
                labelDialog.LJLIL = labelData;
                labelDialog.LLIFFJFJJ = str;
                int labelType2 = labelData.getLabelType();
                if (labelType2 != 0) {
                    if (labelType2 != 1) {
                        if (labelType2 == 2) {
                            labelDialog.LJLJJL = 1;
                        }
                    } else {
                        labelDialog.LJLJJL = 0;
                    }
                } else if (o.LJ(labelData.getInterestTagActive(), Boolean.FALSE) && (interestTagId = labelData.getInterestTagId()) != null && (valueOf = Integer.valueOf(CastIntegerProtector.parseInt(interestTagId))) != null) {
                    if (valueOf.intValue() == 0) {
                        labelDialog.LJLJJL = 0;
                    } else if (valueOf.intValue() == 1) {
                        labelDialog.LJLJJL = 1;
                    } else if (valueOf.intValue() == 2) {
                        labelDialog.LJLJJL = 2;
                        labelDialog.LJLJJLL = String.valueOf(labelData.getInterestTagValue());
                    }
                }
                ASL asl = new ASL();
                asl.LIZIZ(labelDialog);
                asl.LJ(new IDDListenerS154S0100000_15(labelDialog, 3));
                asl.LIZ.LJLLJ = true;
                LabelData labelData2 = labelDialog.LJLIL;
                if (labelData2 != null) {
                    if (labelData2.getLabelType() == 0) {
                        asl.LJI(0);
                    } else {
                        asl.LJI(1);
                        asl.LIZ.LJLLLLLL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(210));
                    }
                    TuxSheet tuxSheet = asl.LIZ;
                    tuxSheet.LJZL = true;
                    labelDialog.LLIIIILZ = tuxSheet;
                    ActivityC45651qj activityC45651qj = labelDialog.LJLILLLLZI;
                    if (activityC45651qj != null) {
                        C1DG.LJII(activityC45651qj, "mActivity.supportFragmentManager", tuxSheet, "LabelDialog");
                        return;
                    } else {
                        o.LJIJI("mActivity");
                        throw null;
                    }
                }
                o.LJIJI("mLabelData");
                throw null;
            }
            o.LJIJI("dialog");
            throw null;
        }
    }

    public static List LLFII(int i, List list) {
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LabelData labelData = (LabelData) it.next();
            arrayList.add(new LabelData(labelData.getInterestTagId(), labelData.getInterestTagValue(), labelData.getInterestTagActive(), i));
        }
        return arrayList;
    }

    public final List<LabelData> LLII(List<LabelData> list, List<LabelData> list2) {
        String str;
        int i;
        ArrayList arrayList = new ArrayList();
        Gender gender = this.LJLLL;
        if (gender != null) {
            String str2 = null;
            String genderType = gender.getGenderType();
            Gender gender2 = this.LJLLL;
            if (gender2 != null) {
                str = gender2.getGenderContent();
            } else {
                str = null;
            }
            Gender gender3 = this.LJLLL;
            if (gender3 != null) {
                str2 = gender3.getGenderSource();
            }
            Boolean valueOf = Boolean.valueOf(o.LJ(str2, CardStruct.IStatusCode.DEFAULT));
            Gender gender4 = this.LJLLL;
            if (gender4 != null) {
                i = gender4.getLabelType();
            } else {
                i = 0;
            }
            arrayList.add(new LabelData(genderType, str, valueOf, i));
        }
        if (list != null && !list.isEmpty()) {
            arrayList.addAll(list);
        }
        if (list2 != null && !list2.isEmpty()) {
            arrayList.addAll(list2);
        }
        return arrayList;
    }
}
