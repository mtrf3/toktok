package com.ss.android.ugc.aweme.kids.choosemusic.widgets;

import X.C16880lQ;
import X.C207668Da;
import X.C32151Nz;
import X.C44384HbQ;
import X.C79004UzY;
import X.C85022XYk;
import X.InterfaceC85019XYh;
import X.SFS;
import X.XTE;
import X.XXD;
import X.XXF;
import X.XXM;
import X.XY6;
import X.XYD;
import X.XYN;
import X.XYS;
import X.XZ1;
import android.text.TextUtils;
import android.view.LayoutInflater;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.arch.widgets.ListItemWidget;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes16.dex */
public class StickerMusicWidget extends ListItemWidget implements Observer {
    public XY6 LJLJLLL;
    public int LJLL = -1;
    public List<Music> LJLLI;
    public int LJLLILLLL;
    public XTE LJLLJ;
    public InterfaceC85019XYh<XYN> LJLLL;
    public XZ1 LJLLLL;

    @Override // com.ss.android.ugc.aweme.arch.widgets.ListItemWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LJIILLIIL() {
        boolean z;
        String str;
        if (C32151Nz.LJJIIJZLJL(this.LJLLI)) {
            this.LJLJLJ.itemView.setVisibility(8);
            return;
        }
        this.LJLJLJ.itemView.setVisibility(0);
        List LJIJJ = C44384HbQ.LJIJJ(this.LJLLI);
        XXM xxm = (XXM) this.LJLJLJ;
        int intValue = ((Integer) this.LJLJJI.get("music_position", -1)).intValue();
        int i = this.LJLL;
        boolean booleanValue = ((Boolean) this.LJLJJI.get("data_sticker_music_from_video", Boolean.FALSE)).booleanValue();
        this.LJLJJI.get("sticker_id", null);
        XXD xxd = new XXD(this);
        InterfaceC85019XYh<XYN> interfaceC85019XYh = this.LJLLL;
        if (xxm.LJLLI) {
            xxm.LJLJJLL.setText(R.string.pux);
        } else if (xxm.LJLL) {
            xxm.LJLJJLL.setText(R.string.pun);
        } else if (booleanValue) {
            xxm.LJLJJLL.setText(R.string.jdl);
        } else {
            xxm.LJLJJLL.setText(R.string.puo);
        }
        int size = ((ArrayList) LJIJJ).size() - xxm.LJLJJL.getChildCount();
        xxm.LJLJLLL.getClass();
        LayoutInflater LLZIL = C16880lQ.LLZIL(xxm.LJLILLLLZI);
        for (int i2 = 0; i2 < size; i2++) {
            C85022XYk c85022XYk = new C85022XYk(C16880lQ.LLLLIILL(LLZIL, R.layout.bg8, xxm.LJLJJL, false), xxm.LJLJLJ);
            ((ArrayList) xxm.LJLJI).add(c85022XYk);
            c85022XYk.itemView.setPadding(0, 0, 0, 0);
            xxm.LJLJJL.addView(c85022XYk.itemView);
        }
        for (int i3 = 0; i3 < ((ArrayList) xxm.LJLJI).size(); i3++) {
            XXF xxf = (XXF) ListProtector.get(xxm.LJLJI, i3);
            MusicModel musicModel = (MusicModel) ListProtector.get(LJIJJ, i3);
            if (-2 == intValue && i3 == i) {
                z = true;
            } else {
                z = false;
            }
            xxf.L(musicModel, false, z, 0, i3);
            xxf.LLD = xxd;
            xxf.LLF = interfaceC85019XYh;
            MusicModel musicModel2 = (MusicModel) ListProtector.get(LJIJJ, i3);
            XTE xte = xxm.LJLJLLL;
            if (musicModel2 != null) {
                str = musicModel2.getMusicId();
            } else {
                str = "";
            }
            SFS.LJJIII(xte, str, i3, true);
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onCreate() {
        DataCenter dataCenter = this.LJLJJI;
        dataCenter.iv0("data_sticker", this, false);
        dataCenter.iv0("music_index", this, false);
        dataCenter.iv0("music_collect_status", this, false);
        dataCenter.iv0("music_loading", this, false);
        ((Integer) this.LJLJJI.get("key_choose_music_type")).intValue();
        super.onCreate();
        XTE xte = new XTE("change_music_page", "attached_song", "", SFS.LJLJJI);
        this.LJLLJ = xte;
        xte.LIZIZ = "prop";
        this.LJLJJI.get("sticker_id", null);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.ListItemWidget
    public final void LJIILJJIL(XYS xys) {
        this.LJLJLJ = xys;
        this.LJLLI = (List) this.LJLJJI.get("data_sticker", null);
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
            case 1730565544:
                if (str.equals("data_sticker")) {
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
                    this.LJLLI = (List) obj2;
                    LJIILLIIL();
                    return;
                }
                int intValue = ((Integer) this.LJLJJI.get("music_position", -1)).intValue();
                int intValue2 = ((Integer) this.LJLJJI.get("music_index", -1)).intValue();
                if (!this.LJLJJLL) {
                    return;
                }
                XXM xxm = (XXM) this.LJLJLJ;
                int i2 = this.LJLL;
                if (i2 >= 0) {
                    if (i2 < ((ArrayList) xxm.LJLJI).size()) {
                        ((XXF) ListProtector.get(xxm.LJLJI, i2)).U(false, false);
                    }
                } else {
                    xxm.getClass();
                }
                if (intValue != -2) {
                    this.LJLL = -1;
                    return;
                } else if (this.LJLL == intValue2) {
                    this.LJLJLLL.k2(null);
                    return;
                } else {
                    this.LJLL = intValue2;
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
            XXM xxm2 = (XXM) this.LJLJLJ;
            int intValue3 = ((Integer) this.LJLJJI.get("music_index")).intValue();
            boolean booleanValue = ((Boolean) this.LJLJJI.get("music_loading")).booleanValue();
            if (intValue3 >= 0) {
                if (intValue3 >= ((ArrayList) xxm2.LJLJI).size()) {
                    return;
                }
                ((XXF) ListProtector.get(xxm2.LJLJI, intValue3)).U(booleanValue, true);
                return;
            }
            xxm2.getClass();
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
        XXM xxm3 = (XXM) xys;
        if (C79004UzY.LJJIFFI(xxm3.LJLJI)) {
            return;
        }
        Iterator it = ((ArrayList) xxm3.LJLJI).iterator();
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
