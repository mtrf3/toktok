package com.ss.android.ugc.aweme.choosemusic.widgets;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C32151Nz;
import X.C44426Hc6;
import X.C45804HyK;
import X.C52536Kjc;
import X.C72H;
import X.C84987XXb;
import X.C85020XYi;
import X.RunnableC61438O9i;
import X.XVF;
import X.XVG;
import X.XX4;
import X.XXG;
import X.XXN;
import X.XXW;
import X.XY4;
import X.XYM;
import X.XYS;
import X.XZ0;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.arch.widgets.ListItemWidget;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes16.dex */
public class StickerMusicWidget extends ListItemWidget implements Observer {
    public Fragment LJLJLLL;
    public XY4 LJLL;
    public int LJLLI = -1;
    public List<Music> LJLLILLLL;
    public int LJLLJ;
    public XVG LJLLL;
    public C72H<XYM> LJLLLL;
    public XZ0 LJLLLLLL;
    public long LJLZ;
    public long LJZ;

    @Override // com.ss.android.ugc.aweme.arch.widgets.ListItemWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final void LJIILLIIL() {
        boolean z;
        boolean z2;
        if (C32151Nz.LJJIIJZLJL(this.LJLLILLLL)) {
            this.LJLJLJ.itemView.setVisibility(8);
            return;
        }
        List<MusicModel> LIZ = C44426Hc6.LIZ(this.LJLLILLLL);
        int i = 0;
        this.LJLJLJ.itemView.setVisibility(0);
        XXN xxn = (XXN) this.LJLJLJ;
        int intValue = ((Integer) this.LJLJJI.get("music_position", -1)).intValue();
        int i2 = this.LJLLI;
        boolean booleanValue = ((Boolean) this.LJLJJI.get("data_sticker_music_from_video", Boolean.FALSE)).booleanValue();
        String str = (String) this.LJLJJI.get("sticker_id", null);
        XX4 xx4 = new XX4(this);
        C72H<XYM> c72h = this.LJLLLL;
        if (this.LJLZ != 0 || this.LJZ != 0) {
            z = true;
        } else {
            z = false;
        }
        if (xxn.LJLLI) {
            xxn.LJLJJLL.setText(R.string.pux);
        } else if (xxn.LJLL) {
            xxn.LJLJJLL.setText(R.string.pun);
        } else if (booleanValue) {
            xxn.LJLJJLL.setText(R.string.jdl);
        } else {
            xxn.LJLJJLL.setText(R.string.puo);
        }
        int size = ((ArrayList) LIZ).size() - xxn.LJLJJL.getChildCount();
        xxn.LJLJLLL.LJFF = str;
        LayoutInflater LLZIL = C16880lQ.LLZIL(xxn.LJLILLLLZI);
        int i3 = 0;
        while (i3 < size) {
            C84987XXb c84987XXb = new C84987XXb(C16880lQ.LLLLIILL(LLZIL, R.layout.bcp, xxn.LJLJJL, i), xxn.LJLJLJ, C52536Kjc.LIZIZ(), C52536Kjc.LIZ());
            ((ArrayList) xxn.LJLJI).add(c84987XXb);
            c84987XXb.itemView.setPadding(0, 0, 0, 0);
            xxn.LJLJJL.addView(c84987XXb.itemView);
            i3++;
            i = 0;
        }
        while (i < ((ArrayList) xxn.LJLJI).size()) {
            XXG xxg = (XXG) ListProtector.get(xxn.LJLJI, i);
            MusicModel musicModel = (MusicModel) ListProtector.get(LIZ, i);
            if (-2 == intValue && i == i2) {
                z2 = true;
            } else {
                z2 = false;
            }
            xxg.L(new XXW(musicModel, "", false, false, z2, z, 0, 0, i, xxn.LJLJLLL, 0, C52536Kjc.LIZIZ(), C52536Kjc.LIZ(), 0, false, false));
            xxg.LLIIJLIL = xx4;
            xxg.LLIIZ = c72h;
            MusicModel musicModel2 = (MusicModel) ListProtector.get(LIZ, i);
            if (musicModel2 != null) {
                if (musicModel2.getLogPb() != null) {
                    xxn.LJLJLLL.LJIIIIZZ = musicModel2.getLogPb();
                }
                ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(xxn.LJLILLLLZI);
                if (LJJIFFI != null) {
                    XVF.LJIIL(new RunnableC61438O9i(xxn.itemView, musicModel2, Integer.valueOf(i)), LJJIFFI, xxn.LJLJLLL, musicModel2, i, true, false);
                }
            }
            i++;
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onCreate() {
        DataCenter dataCenter = this.LJLJJI;
        dataCenter.iv0("data_sticker", this, false);
        dataCenter.iv0("music_index", this, false);
        dataCenter.iv0("music_collect_status", this, false);
        dataCenter.iv0("music_loading", this, false);
        dataCenter.iv0("music_reset_play_start", this, false);
        ((Integer) this.LJLJJI.get("key_choose_music_type")).intValue();
        super.onCreate();
        XVG xvg = new XVG("change_music_page", "attached_song", "", XVF.LIZ);
        this.LJLLL = xvg;
        xvg.LIZIZ = "prop";
        xvg.LJFF = (String) this.LJLJJI.get("sticker_id", null);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.ListItemWidget
    public final void LJIILJJIL(XYS xys) {
        this.LJLJLJ = xys;
        this.LJLLILLLL = (List) this.LJLJJI.get("data_sticker", null);
        LJIILLIIL();
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.ListItemWidget
    public final boolean LJIILL(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof C85020XYi) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x003b, code lost:
    
        if (r5.equals("music_reset_play_start") == false) goto L7;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x001a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011a  */
    @Override // androidx.lifecycle.Observer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onChanged(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.choosemusic.widgets.StickerMusicWidget.onChanged(java.lang.Object):void");
    }
}
