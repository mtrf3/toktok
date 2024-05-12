package com.ss.android.ugc.aweme.anchor;

import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C1B3;
import X.C1B6;
import X.C36922EeM;
import X.C38350F3i;
import X.C42779Gqd;
import X.C42782Gqg;
import X.C63081OpJ;
import X.C65803Ps7;
import X.EnumC42934Gt8;
import X.GC1;
import X.InterfaceC42726Gpm;
import X.InterfaceC42777Gqb;
import X.OSZ;
import X.X1D;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.AnchorBaseFragment;
import com.ss.android.ugc.aweme.AnchorRecentlyAddFragment;
import com.ss.android.ugc.aweme.AnchorSearchFragment;
import com.ss.android.ugc.aweme.AnchorSelectionFragment;
import com.ss.android.ugc.aweme.api.model.AnchorCell;
import com.ss.android.ugc.aweme.api.model.AnchorModule;
import com.ss.android.ugc.aweme.liveevent.LiveEventModule;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class AnchorBaseActivity extends ActivityC86117Xqz implements InterfaceC42726Gpm {
    public AnchorRecentlyAddFragment LJLIL;
    public AnchorSearchFragment LJLILLLLZI;
    public AnchorSelectionFragment LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();

    @Override // X.InterfaceC42726Gpm
    public void LJJJIL(LiveEventModule liveEventModule) {
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
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
    public void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.anchor.AnchorBaseActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC42726Gpm
    public final String LJIIZILJ() {
        String str = this.LJLJJL;
        if (str != null) {
            return str;
        }
        o.LJIJI("creationId");
        throw null;
    }

    @Override // X.InterfaceC42726Gpm
    public final void LJLLLL() {
        C42782Gqg c42782Gqg;
        Object obj;
        OSZ osz;
        Integer num;
        ArrayList<AnchorCell> arrayList;
        AnchorSelectionFragment anchorSelectionFragment = this.LJLJI;
        if (anchorSelectionFragment != null && (c42782Gqg = anchorSelectionFragment.LJLJJL) != null) {
            T t = c42782Gqg.LJLIL;
            o.LJI(t);
            C42779Gqd c42779Gqd = (C42779Gqd) t;
            Iterator it = ((ArrayList) c42779Gqd.LJLJJI).iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    Integer num2 = ((AnchorModule) obj).type;
                    if (num2 != null && num2.intValue() == 2) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            AnchorModule anchorModule = (AnchorModule) obj;
            if (anchorModule != null && (arrayList = anchorModule.cells) != null) {
                arrayList.clear();
            }
            int LJIIIZ = c42779Gqd.LJIIIZ();
            Iterator it2 = ((ArrayList) c42779Gqd.LJLJI).iterator();
            int i = 0;
            while (true) {
                if (it2.hasNext()) {
                    Object next = it2.next();
                    if ((next instanceof AnchorModule) && (num = ((AnchorModule) next).type) != null && num.intValue() == 1) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            if (LJIIIZ > i) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("error module range, from=");
                LIZ.append(LJIIIZ);
                LIZ.append(", to=");
                LIZ.append(i);
                C36922EeM.LJ(X1D.LIZIZ(LIZ));
                osz = new OSZ(0, 0);
            } else {
                osz = new OSZ(Integer.valueOf(LJIIIZ), Integer.valueOf(i));
            }
            ((ArrayList) c42779Gqd.LJLJI).subList(((Number) osz.getFirst()).intValue(), ((Number) osz.getSecond()).intValue()).clear();
            K k = c42782Gqg.LJLILLLLZI;
            o.LJI(k);
            T t2 = c42782Gqg.LJLIL;
            o.LJI(t2);
            ((InterfaceC42777Gqb) k).x10(((C42779Gqd) t2).LJIIIZ());
        }
    }

    @Override // X.InterfaceC42726Gpm
    public final String getShootWay() {
        String str = this.LJLJJI;
        if (str != null) {
            return str;
        }
        o.LJIJI("shootWay");
        throw null;
    }

    @Override // X.InterfaceC42726Gpm
    public final void LJLJI() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C1B3 LIZ = C1B6.LIZ(supportFragmentManager, supportFragmentManager);
        if (this.LJLILLLLZI == null) {
            this.LJLILLLLZI = new AnchorSearchFragment();
        }
        AnchorSearchFragment anchorSearchFragment = this.LJLILLLLZI;
        if (anchorSearchFragment != null) {
            if (!anchorSearchFragment.isAdded()) {
                LIZ.LJIIIIZZ(R.id.dm2, 1, anchorSearchFragment, null);
            }
            AnchorSelectionFragment anchorSelectionFragment = this.LJLJI;
            if (anchorSelectionFragment != null) {
                LIZ.LJIIL(anchorSearchFragment);
                LIZ.LJIIIZ(anchorSelectionFragment);
                LIZ.LJ(null);
                LIZ.LJI();
            }
        }
    }

    public void LLFII() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C1B3 LIZ = C1B6.LIZ(supportFragmentManager, supportFragmentManager);
        if (this.LJLJI == null) {
            this.LJLJI = new AnchorSelectionFragment();
        }
        AnchorSelectionFragment anchorSelectionFragment = this.LJLJI;
        if (anchorSelectionFragment != null) {
            LIZ.LJIIIIZZ(R.id.dm2, 1, anchorSelectionFragment, null);
            LIZ.LJI();
        }
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(R.anim.di, R.anim.dj);
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        AnchorRecentlyAddFragment anchorRecentlyAddFragment;
        if (getSupportFragmentManager().LJJJJIZL() == 0) {
            super.onBackPressed();
            return;
        }
        AnchorRecentlyAddFragment anchorRecentlyAddFragment2 = this.LJLIL;
        if (anchorRecentlyAddFragment2 != null && anchorRecentlyAddFragment2.isVisible() && (anchorRecentlyAddFragment = this.LJLIL) != null && anchorRecentlyAddFragment.LJLJJI) {
            anchorRecentlyAddFragment.vl(false);
        } else {
            getSupportFragmentManager().LJJLIIIJJI();
        }
    }

    @Override // X.InterfaceC42726Gpm
    public final void LJJIJIIJIL() {
        finish();
    }

    @Override // X.InterfaceC42726Gpm
    public final void LJJLIIIJLJLI(ArrayList<AnchorCell> arrayList) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C1B3 LIZ = C1B6.LIZ(supportFragmentManager, supportFragmentManager);
        if (this.LJLIL == null) {
            this.LJLIL = new AnchorRecentlyAddFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("recently_add", arrayList);
            AnchorRecentlyAddFragment anchorRecentlyAddFragment = this.LJLIL;
            if (anchorRecentlyAddFragment != null) {
                anchorRecentlyAddFragment.setArguments(bundle);
            }
        }
        AnchorRecentlyAddFragment anchorRecentlyAddFragment2 = this.LJLIL;
        if (anchorRecentlyAddFragment2 != null) {
            if (!anchorRecentlyAddFragment2.isAdded()) {
                LIZ.LJIIIIZZ(R.id.dm2, 1, anchorRecentlyAddFragment2, null);
            }
            AnchorSelectionFragment anchorSelectionFragment = this.LJLJI;
            if (anchorSelectionFragment != null) {
                LIZ.LJIIL(anchorRecentlyAddFragment2);
                LIZ.LJIIIZ(anchorSelectionFragment);
                LIZ.LJ(null);
                LIZ.LJI();
            }
        }
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public void onCreate(Bundle bundle) {
        int type;
        String queryParameter;
        String str;
        String queryParameter2;
        Integer LJJIL;
        EnumC42934Gt8 enumC42934Gt8;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.anchor.AnchorBaseActivity", "onCreate", true);
        activityConfiguration(GC1.LJLIL);
        super.onCreate(bundle);
        setContentView(R.layout.dm);
        String str2 = "";
        if (getIntent().getData() == null) {
            Serializable serializableExtra = getIntent().getSerializableExtra("anchor_type");
            if (!(serializableExtra instanceof EnumC42934Gt8) || (enumC42934Gt8 = (EnumC42934Gt8) serializableExtra) == null) {
                enumC42934Gt8 = EnumC42934Gt8.NO_TYPE;
            }
            o.LJIIIZ(enumC42934Gt8, "<set-?>");
            AnchorBaseFragment.LJLJI = enumC42934Gt8;
            String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "shoot_way");
            if (LLJJIJIIJIL == null) {
                LLJJIJIIJIL = "";
            }
            this.LJLJJI = LLJJIJIIJIL;
            String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(getIntent(), "creation_id");
            if (LLJJIJIIJIL2 != null) {
                str2 = LLJJIJIIJIL2;
            }
            this.LJLJJL = str2;
        } else {
            Uri data = getIntent().getData();
            if (data != null && (queryParameter2 = UriProtector.getQueryParameter(data, "business_type")) != null && (LJJIL = C38350F3i.LJJIL(queryParameter2)) != null) {
                type = LJJIL.intValue();
            } else {
                type = EnumC42934Gt8.COMMON_TYPE.getTYPE();
            }
            EnumC42934Gt8 enumC42934Gt82 = EnumC42934Gt8.COMMON_TYPE;
            enumC42934Gt82.setTYPE(type);
            AnchorBaseFragment.LJLJI = enumC42934Gt82;
            String LLJJIJIIJIL3 = C16880lQ.LLJJIJIIJIL(getIntent(), "shoot_way");
            if (LLJJIJIIJIL3 == null) {
                LLJJIJIIJIL3 = "";
            }
            this.LJLJJI = LLJJIJIIJIL3;
            if (LLJJIJIIJIL3.length() == 0) {
                if (data == null || (str = UriProtector.getQueryParameter(data, "shoot_way")) == null) {
                    str = "";
                }
                this.LJLJJI = str;
            }
            String LLJJIJIIJIL4 = C16880lQ.LLJJIJIIJIL(getIntent(), "creation_id");
            if (LLJJIJIIJIL4 == null) {
                LLJJIJIIJIL4 = "";
            }
            this.LJLJJL = LLJJIJIIJIL4;
            if (LLJJIJIIJIL4.length() == 0) {
                if (data != null && (queryParameter = UriProtector.getQueryParameter(data, "creation_id")) != null) {
                    str2 = queryParameter;
                }
                this.LJLJJL = str2;
            }
        }
        ViewGroup.LayoutParams layoutParams = _$_findCachedViewById(R.id.kej).getLayoutParams();
        layoutParams.height = C63081OpJ.LJJJJLI(this);
        _$_findCachedViewById(R.id.kej).setLayoutParams(layoutParams);
        LLFII();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.anchor.AnchorBaseActivity", "onCreate", false);
    }
}
