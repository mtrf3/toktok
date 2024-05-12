package com.ss.android.ugc.aweme.kids.choosemusic.widgets;

import X.C09900aA;
import X.C16880lQ;
import X.C198517qh;
import X.C207668Da;
import X.C44384HbQ;
import X.C79004UzY;
import X.C85022XYk;
import X.InterfaceC85019XYh;
import X.KL2;
import X.SFS;
import X.XTE;
import X.XXB;
import X.XXF;
import X.XXK;
import X.XY6;
import X.XYD;
import X.XYN;
import X.XYS;
import X.XZ1;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.arch.widgets.ListItemWidget;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes16.dex */
public class ChallengeMusicWidget extends ListItemWidget implements Observer {
    public Challenge LJLJLLL;
    public XY6 LJLL;
    public int LJLLI = -1;
    public int LJLLILLLL;
    public XTE LJLLJ;
    public InterfaceC85019XYh<XYN> LJLLL;
    public XZ1 LJLLLL;

    @Override // com.ss.android.ugc.aweme.arch.widgets.ListItemWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v10 */
    public final void LJIILLIIL() {
        boolean z;
        String str;
        if (this.LJLJLLL == null) {
            this.LJLJLJ.itemView.setVisibility(8);
            return;
        }
        ?? r3 = 0;
        this.LJLJLJ.itemView.setVisibility(0);
        List LJIJJ = C44384HbQ.LJIJJ(this.LJLJLLL.getConnectMusics());
        XXK xxk = (XXK) this.LJLJLJ;
        Challenge challenge = this.LJLJLLL;
        int intValue = ((Integer) this.LJLJJI.get("music_position", -1)).intValue();
        int i = this.LJLLI;
        this.LJLJJI.get("challenge_id", null);
        XXB xxb = new XXB(this);
        InterfaceC85019XYh<XYN> interfaceC85019XYh = this.LJLLL;
        if (challenge == null) {
            xxk.getClass();
            return;
        }
        LayoutInflater LLZIL = C16880lQ.LLZIL(xxk.LJLILLLLZI);
        xxk.L(challenge.getChallengeName());
        xxk.LJLJLLL.getClass();
        ArrayList arrayList = (ArrayList) LJIJJ;
        int size = arrayList.size() - xxk.LJLJJLL.getChildCount();
        int i2 = 0;
        while (i2 < size) {
            C85022XYk c85022XYk = new C85022XYk(C16880lQ.LLLLIILL(LLZIL, R.layout.bg8, xxk.LJLJJLL, r3), xxk.LJLJLJ);
            ((ArrayList) xxk.LJLJI).add(c85022XYk);
            c85022XYk.itemView.setPadding(r3, r3, r3, r3);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c85022XYk.LJLLILLLL.getLayoutParams();
            marginLayoutParams.bottomMargin = (int) KL2.LIZJ(c85022XYk.LJLZ, 2.0f);
            marginLayoutParams.topMargin = (int) KL2.LIZJ(c85022XYk.LJLZ, 2.0f);
            c85022XYk.LJLLILLLL.requestLayout();
            c85022XYk.LJLLL.setVisibility(8);
            ((ViewGroup.MarginLayoutParams) c85022XYk.LJLJLJ.getLayoutParams()).rightMargin = (int) KL2.LIZJ(c85022XYk.LJLZ, 8.0f);
            c85022XYk.LJLJLJ.requestLayout();
            xxk.LJLJJLL.addView(c85022XYk.itemView);
            i2++;
            r3 = 0;
        }
        for (int i3 = 0; i3 < ((ArrayList) xxk.LJLJI).size(); i3++) {
            XXF xxf = (XXF) ListProtector.get(xxk.LJLJI, i3);
            MusicModel musicModel = (MusicModel) ListProtector.get(LJIJJ, i3);
            if (intValue == -2 && i3 == i) {
                z = true;
            } else {
                z = false;
            }
            xxf.L(musicModel, false, z, 0, i3);
            xxf.LLD = xxb;
            xxf.LLF = interfaceC85019XYh;
            MusicModel musicModel2 = (MusicModel) ListProtector.get(LJIJJ, i3);
            XTE xte = xxk.LJLJLLL;
            if (musicModel2 != null) {
                str = musicModel2.getMusicId();
            } else {
                str = "";
            }
            SFS.LJJIII(xte, str, i3, true);
        }
        String shootWay = AVExternalServiceImpl.LIZ().publishService().getShootWay();
        AVChallenge curChallenge = AVExternalServiceImpl.LIZ().publishService().getCurChallenge();
        if (!TextUtils.equals(shootWay, "challenge") || curChallenge == null || C79004UzY.LJJIFFI(LJIJJ) || !curChallenge.isCommerce) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MusicModel musicModel3 = (MusicModel) it.next();
            if (musicModel3 != null) {
                arrayList2.add(musicModel3.getMusicId());
            }
        }
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("shoot_way", shootWay);
        c198517qh.LIZ.put("challenge_id", curChallenge.cid);
        c198517qh.LIZ.put("music_ids", arrayList2.toString());
        C09900aA.LJIIJJI("music_recommendations_monitor", 0, c198517qh.LJ());
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onCreate() {
        DataCenter dataCenter = this.LJLJJI;
        dataCenter.iv0("data_challenge", this, false);
        dataCenter.iv0("music_index", this, false);
        dataCenter.iv0("music_collect_status", this, false);
        dataCenter.iv0("music_loading", this, false);
        ((Integer) this.LJLJJI.get("key_choose_music_type")).intValue();
        super.onCreate();
        this.LJLLJ = new XTE("change_music_page", "attached_song", "", SFS.LJLJJI);
        this.LJLJJI.get("challenge_id", null);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.ListItemWidget
    public final void LJIILJJIL(XYS xys) {
        this.LJLJLJ = xys;
        this.LJLJLLL = (Challenge) this.LJLJJI.get("data_challenge");
        LJIILLIIL();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        char c;
        MusicModel.CollectionType collectionType;
        C207668Da c207668Da = (C207668Da) obj;
        String str = c207668Da.LIZ;
        str.getClass();
        int i = -1;
        switch (str.hashCode()) {
            case -1635157503:
                if (str.equals("music_collect_status")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 502104354:
                if (str.equals("music_loading")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1579846200:
                if (str.equals("music_index")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 2085247502:
                if (str.equals("data_challenge")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        Object obj2 = null;
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        return;
                    }
                    Object obj3 = c207668Da.LIZIZ;
                    if (obj3 != null) {
                        obj2 = obj3;
                    }
                    this.LJLJLLL = (Challenge) obj2;
                    LJIILLIIL();
                    return;
                }
                int intValue = ((Integer) this.LJLJJI.get("music_position", -1)).intValue();
                int intValue2 = ((Integer) this.LJLJJI.get("music_index", -1)).intValue();
                if (!this.LJLJJLL) {
                    return;
                }
                XXK xxk = (XXK) this.LJLJLJ;
                int i2 = this.LJLLI;
                if (i2 >= 0) {
                    if (i2 < ((ArrayList) xxk.LJLJI).size()) {
                        ((XXF) ListProtector.get(xxk.LJLJI, i2)).U(false, false);
                    }
                } else {
                    xxk.getClass();
                }
                if (intValue != -2) {
                    this.LJLLI = -1;
                    return;
                } else if (this.LJLLI == intValue2) {
                    this.LJLL.k2(null);
                    return;
                } else {
                    this.LJLLI = intValue2;
                    return;
                }
            }
            if (this.LJLJLJ == null) {
                return;
            }
            Integer num = (Integer) this.LJLJJI.get("music_position");
            if (num != null) {
                i = num.intValue();
            }
            if (this.LJLLILLLL != i) {
                return;
            }
            XXK xxk2 = (XXK) this.LJLJLJ;
            int intValue3 = ((Integer) this.LJLJJI.get("music_index")).intValue();
            boolean booleanValue = ((Boolean) this.LJLJJI.get("music_loading")).booleanValue();
            if (intValue3 >= 0) {
                if (intValue3 >= ((ArrayList) xxk2.LJLJI).size()) {
                    return;
                }
                ((XXF) ListProtector.get(xxk2.LJLJI, intValue3)).U(booleanValue, true);
                return;
            }
            xxk2.getClass();
            return;
        }
        Object obj4 = c207668Da.LIZIZ;
        if (obj4 != null) {
            obj2 = obj4;
        }
        XYD xyd = (XYD) obj2;
        int i3 = xyd.LIZ;
        if (i3 == 1) {
            if (this.LJLLILLLL != xyd.LIZIZ) {
                return;
            }
        } else if (i3 != 0) {
            return;
        }
        XYS xys = this.LJLJLJ;
        if (xys == null) {
            return;
        }
        XXK xxk3 = (XXK) xys;
        if (C79004UzY.LJJIFFI(xxk3.LJLJI)) {
            return;
        }
        Iterator it = ((ArrayList) xxk3.LJLJI).iterator();
        while (it.hasNext()) {
            XXF xxf = (XXF) it.next();
            MusicModel musicModel = xyd.LJ;
            if (musicModel != null && !TextUtils.isEmpty(musicModel.getMusicId()) && xxf.LJZ != null && musicModel.getMusicId().equals(xxf.LJZ.getMusicId())) {
                MusicModel musicModel2 = xxf.LJZ;
                if (xyd.LIZLLL == 1) {
                    collectionType = MusicModel.CollectionType.COLLECTED;
                } else {
                    collectionType = MusicModel.CollectionType.NOT_COLLECTED;
                }
                musicModel2.setCollectionType(collectionType);
                xxf.M();
                return;
            }
        }
    }
}
