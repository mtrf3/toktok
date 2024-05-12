package com.ss.android.ugc.aweme.choosemusic.widgets;

import X.ActivityC45651qj;
import X.C09900aA;
import X.C16880lQ;
import X.C198517qh;
import X.C44426Hc6;
import X.C45804HyK;
import X.C52536Kjc;
import X.C72H;
import X.C79004UzY;
import X.C84987XXb;
import X.C85017XYf;
import X.C90193gN;
import X.KL2;
import X.RunnableC61438O9i;
import X.XVF;
import X.XVG;
import X.XX5;
import X.XXG;
import X.XXP;
import X.XXW;
import X.XY4;
import X.XYM;
import X.XYS;
import X.XZ0;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.arch.widgets.ListItemWidget;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.challenge.service.CommerceChallengeServiceImpl;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes16.dex */
public class ChallengeMusicWidget extends ListItemWidget implements Observer {
    public Fragment LJLJLLL;
    public Challenge LJLL;
    public XY4 LJLLI;
    public int LJLLILLLL = -1;
    public int LJLLJ;
    public XVG LJLLL;
    public long LJLLLL;
    public long LJLLLLLL;
    public C72H<XYM> LJLZ;
    public XZ0 LJZ;

    @Override // com.ss.android.ugc.aweme.arch.widgets.ListItemWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LJIILLIIL() {
        boolean z;
        boolean z2;
        Challenge challenge = this.LJLL;
        if (challenge == null) {
            this.LJLJLJ.itemView.setVisibility(8);
            return;
        }
        List<MusicModel> LIZ = C44426Hc6.LIZ(challenge.getConnectMusics());
        this.LJLJLJ.itemView.setVisibility(0);
        XXP xxp = (XXP) this.LJLJLJ;
        Challenge challenge2 = this.LJLL;
        int intValue = ((Integer) this.LJLJJI.get("music_position", -1)).intValue();
        int i = this.LJLLILLLL;
        String str = (String) this.LJLJJI.get("challenge_id", null);
        XX5 xx5 = new XX5(this);
        C72H<XYM> c72h = this.LJLZ;
        if (this.LJLLLL != 0 || this.LJLLLLLL != 0) {
            z = true;
        } else {
            z = false;
        }
        if (challenge2 == null) {
            xxp.getClass();
            return;
        }
        LayoutInflater LLZIL = C16880lQ.LLZIL(xxp.LJLILLLLZI);
        String challengeName = challenge2.getChallengeName();
        xxp.LJLJJL.setText(xxp.LJLILLLLZI.getString(R.string.pum).replace("%s", ""));
        if (C90193gN.LIZIZ(xxp.LJLILLLLZI)) {
            xxp.LJLJJLL.setGravity(5);
        }
        String LJFF = i0.LJFF("#", challengeName);
        UrlModel LJIJ = CommerceChallengeServiceImpl.LIZIZ().LJIJ(LJFF, true, true);
        if (LJIJ != null) {
            LJFF = i0.LJFF(LJFF, " ");
        }
        SpannableString spannableString = new SpannableString(LJFF);
        spannableString.setSpan(new StyleSpan(1), 0, LJFF.length(), 17);
        if (LJIJ != null) {
            CommerceChallengeServiceImpl.LIZIZ().LJIILJJIL(xxp.LJLILLLLZI, challengeName, LJIJ, spannableString, xxp.LJLJJLL, "basedon_music_hashtag");
        } else {
            xxp.LJLJJLL.setText(spannableString);
        }
        xxp.LJLL.LJI = str;
        ArrayList arrayList = (ArrayList) LIZ;
        int size = arrayList.size() - xxp.LJLJL.getChildCount();
        for (int i2 = 0; i2 < size; i2++) {
            C84987XXb c84987XXb = new C84987XXb(C16880lQ.LLLLIILL(LLZIL, R.layout.bcp, xxp.LJLJL, false), xxp.LJLJLLL, false, false);
            ((ArrayList) xxp.LJLJI).add(c84987XXb);
            c84987XXb.itemView.setPadding(0, 0, 0, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c84987XXb.LJLLLLLL.getLayoutParams();
            marginLayoutParams.bottomMargin = (int) KL2.LIZJ(c84987XXb.LLFF, 2.0f);
            marginLayoutParams.topMargin = (int) KL2.LIZJ(c84987XXb.LLFF, 2.0f);
            c84987XXb.LJLLLLLL.requestLayout();
            c84987XXb.LJZ.setVisibility(8);
            c84987XXb.LJLL.requestLayout();
            xxp.LJLJL.addView(c84987XXb.itemView);
        }
        for (int i3 = 0; i3 < ((ArrayList) xxp.LJLJI).size(); i3++) {
            XXG xxg = (XXG) ListProtector.get(xxp.LJLJI, i3);
            MusicModel musicModel = (MusicModel) ListProtector.get(LIZ, i3);
            if (intValue == -2 && i3 == i) {
                z2 = true;
            } else {
                z2 = false;
            }
            xxg.L(new XXW(musicModel, "", false, false, z2, z, 0, 0, i3, xxp.LJLL, 0, C52536Kjc.LIZIZ(), C52536Kjc.LIZ(), 0, false, false));
            xxg.LLIIJLIL = xx5;
            xxg.LLIIZ = c72h;
            MusicModel musicModel2 = (MusicModel) ListProtector.get(LIZ, i3);
            if (musicModel2 != null && musicModel2.getLogPb() != null) {
                xxp.LJLL.LJIIIIZZ = musicModel2.getLogPb();
            }
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(xxp.LJLILLLLZI);
            if (LJJIFFI != null) {
                XVF.LJIIL(new RunnableC61438O9i(xxp.itemView, musicModel2, Integer.valueOf(i3)), LJJIFFI, xxp.LJLL, musicModel2, i3, true, false);
            }
        }
        String shootWay = AVExternalServiceImpl.LIZ().publishService().getShootWay();
        AVChallenge curChallenge = AVExternalServiceImpl.LIZ().publishService().getCurChallenge();
        if (!TextUtils.equals(shootWay, "challenge") || curChallenge == null || C79004UzY.LJJIFFI(LIZ) || !curChallenge.isCommerce) {
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
        dataCenter.iv0("music_reset_play_start", this, false);
        ((Integer) this.LJLJJI.get("key_choose_music_type")).intValue();
        super.onCreate();
        XVG xvg = new XVG("change_music_page", "attached_song", "", XVF.LIZ);
        this.LJLLL = xvg;
        xvg.LJI = (String) this.LJLJJI.get("challenge_id", null);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.ListItemWidget
    public final void LJIILJJIL(XYS xys) {
        this.LJLJLJ = xys;
        this.LJLL = (Challenge) this.LJLJJI.get("data_challenge");
        LJIILLIIL();
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.ListItemWidget
    public final boolean LJIILL(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof C85017XYf) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.choosemusic.widgets.ChallengeMusicWidget.onChanged(java.lang.Object):void");
    }
}
