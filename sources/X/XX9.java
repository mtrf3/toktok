package X;

import Y.ARunnableS11S0201000_8;
import android.media.MediaPlayer;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* loaded from: classes16.dex */
public final class XX9 extends C8HS<MusicModel> {
    public XY6 LJLIL;
    public final InterfaceC85019XYh<XYN> LJLILLLLZI;
    public RecyclerView LJLJI;
    public String LJLJJL;
    public XTE LJLJJLL;
    public boolean LJLJL;
    public int LJLJLLL;
    public int LJLJJI = -1;
    public boolean LJLJLJ = true;
    public final XX8 LJLL = new XX8(this);
    public final XYQ LJLLI = new XYQ(this);

    public final void LJLLLLLL() {
        if (this.LJLJJI < 0) {
            return;
        }
        MediaPlayer LIZ = XTP.LIZ();
        int i = this.LJLJJI;
        if (i != -1) {
            RecyclerView.ViewHolder LJJIZ = this.LJLJI.LJJIZ(i);
            if (LJJIZ instanceof C85022XYk) {
                ((XXF) LJJIZ).U(false, false);
            }
            int i2 = this.LJLJJI;
            this.LJLJJI = -1;
            this.LJLJJL = null;
            if (LJJIZ == null) {
                notifyItemChanged(i2);
            }
        }
        if (LIZ != null && LIZ.isPlaying()) {
            LIZ.pause();
        }
        XY6 xy6 = this.LJLIL;
        if (xy6 != null) {
            xy6.k2(null);
        }
    }

    public final void LJLZ() {
        int i = -1;
        if (TextUtils.isEmpty(this.LJLJJL) || C79004UzY.LJJIFFI(getData())) {
            this.LJLJJI = -1;
            return;
        }
        for (MusicModel musicModel : getData()) {
            i++;
            if (musicModel != null && TextUtils.equals(musicModel.getMusicId(), this.LJLJJL)) {
                this.LJLJJI = i;
                return;
            }
        }
        this.LJLJJI = i;
    }

    @Override // X.C8HS, X.C4II
    public final int getBasicItemCount() {
        return super.getBasicItemCount();
    }

    public XX9(InterfaceC85019XYh<XYN> interfaceC85019XYh) {
        this.LJLILLLLZI = interfaceC85019XYh;
    }

    @Override // X.C4II
    public final int getBasicItemViewType(int i) {
        List<T> list = this.mmItems;
        if (list != 0 && ListProtector.get(list, i) != null) {
            return 0;
        }
        return -1;
    }

    @Override // X.MK7, X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.LJLJI = recyclerView;
        registerAdapterDataObserver(this.LJLLI);
    }

    @Override // X.MK7, X.AbstractC029409q
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        unregisterAdapterDataObserver(this.LJLLI);
        this.LJLJI = null;
    }

    public XX9(InterfaceC85019XYh interfaceC85019XYh, int i) {
        this.LJLILLLLZI = interfaceC85019XYh;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x00b3. Please report as an issue. */
    @Override // X.C4II
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String str;
        String singer;
        int i2;
        boolean z;
        MusicModel musicModel = (MusicModel) ListProtector.get(getData(), i);
        if (musicModel != null) {
            if (viewHolder instanceof C85022XYk) {
                XXF xxf = (XXF) viewHolder;
                boolean z2 = this.LJLJL;
                if (i == this.LJLJJI) {
                    z = true;
                } else {
                    z = false;
                }
                xxf.L(musicModel, z2, z, 0, i);
            } else if (viewHolder instanceof C84992XXg) {
                C84992XXg c84992XXg = (C84992XXg) viewHolder;
                c84992XXg.LJLJLLL = this.LJLJL;
                c84992XXg.LJLJLJ = i;
                c84992XXg.LJLJL = musicModel;
                if (!TextUtils.isEmpty(musicModel.getName())) {
                    c84992XXg.LJLJI.setText(c84992XXg.LJLJL.getName());
                } else {
                    c84992XXg.LJLJI.setTextColor(C79045V0n.LJI(R.attr.go, c84992XXg.LJLJJLL).intValue());
                    TextView textView = c84992XXg.LJLJI;
                    if (!TextUtils.isEmpty(c84992XXg.LJLJL.getName())) {
                        str = c84992XXg.LJLJL.getName();
                    } else {
                        str = "";
                    }
                    textView.setText(str);
                }
                C72114SRy.LIZ(c84992XXg.LJLJI, c84992XXg.LJLJL.getMusic());
                TextView textView2 = c84992XXg.LJLJJI;
                if (TextUtils.isEmpty(c84992XXg.LJLJL.getSinger())) {
                    singer = c84992XXg.LJLJJLL.getString(R.string.tel);
                } else {
                    singer = c84992XXg.LJLJL.getSinger();
                }
                textView2.setText(singer);
                SmartImageView smartImageView = c84992XXg.LJLIL;
                smartImageView.post(new ARunnableS11S0201000_8(2, c84992XXg.LJLJL, smartImageView, 6));
                c84992XXg.LJLJJL.setText(C78929UyL.LJIIIZ(c84992XXg.LJLJL.getPresenterDuration()));
                if (c84992XXg.LJLJLLL && c84992XXg.LJLJLJ < 12) {
                    c84992XXg.LJLILLLLZI.setVisibility(0);
                    switch (c84992XXg.LJLJLJ) {
                        case 0:
                            i2 = R.drawable.bks;
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c84992XXg.LJLILLLLZI.getLayoutParams();
                            int LIZJ = (int) KL2.LIZJ(c84992XXg.LJLILLLLZI.getContext(), 0.0f);
                            marginLayoutParams.topMargin = LIZJ;
                            marginLayoutParams.leftMargin = LIZJ;
                            c84992XXg.LJLILLLLZI.setImageResource(i2);
                            break;
                        case 1:
                            i2 = R.drawable.bkw;
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) c84992XXg.LJLILLLLZI.getLayoutParams();
                            int LIZJ2 = (int) KL2.LIZJ(c84992XXg.LJLILLLLZI.getContext(), 0.0f);
                            marginLayoutParams2.topMargin = LIZJ2;
                            marginLayoutParams2.leftMargin = LIZJ2;
                            c84992XXg.LJLILLLLZI.setImageResource(i2);
                            break;
                        case 2:
                            i2 = R.drawable.bkx;
                            ViewGroup.MarginLayoutParams marginLayoutParams22 = (ViewGroup.MarginLayoutParams) c84992XXg.LJLILLLLZI.getLayoutParams();
                            int LIZJ22 = (int) KL2.LIZJ(c84992XXg.LJLILLLLZI.getContext(), 0.0f);
                            marginLayoutParams22.topMargin = LIZJ22;
                            marginLayoutParams22.leftMargin = LIZJ22;
                            c84992XXg.LJLILLLLZI.setImageResource(i2);
                            break;
                        case 3:
                            i2 = R.drawable.bky;
                            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) c84992XXg.LJLILLLLZI.getLayoutParams();
                            int LIZJ3 = (int) KL2.LIZJ(c84992XXg.LJLILLLLZI.getContext(), 2.0f);
                            marginLayoutParams3.topMargin = LIZJ3;
                            marginLayoutParams3.leftMargin = LIZJ3;
                            c84992XXg.LJLILLLLZI.setImageResource(i2);
                            break;
                        case 4:
                            i2 = R.drawable.bkz;
                            ViewGroup.MarginLayoutParams marginLayoutParams32 = (ViewGroup.MarginLayoutParams) c84992XXg.LJLILLLLZI.getLayoutParams();
                            int LIZJ32 = (int) KL2.LIZJ(c84992XXg.LJLILLLLZI.getContext(), 2.0f);
                            marginLayoutParams32.topMargin = LIZJ32;
                            marginLayoutParams32.leftMargin = LIZJ32;
                            c84992XXg.LJLILLLLZI.setImageResource(i2);
                            break;
                        case 5:
                            i2 = R.drawable.bl0;
                            ViewGroup.MarginLayoutParams marginLayoutParams322 = (ViewGroup.MarginLayoutParams) c84992XXg.LJLILLLLZI.getLayoutParams();
                            int LIZJ322 = (int) KL2.LIZJ(c84992XXg.LJLILLLLZI.getContext(), 2.0f);
                            marginLayoutParams322.topMargin = LIZJ322;
                            marginLayoutParams322.leftMargin = LIZJ322;
                            c84992XXg.LJLILLLLZI.setImageResource(i2);
                            break;
                        case 6:
                            i2 = R.drawable.bl1;
                            ViewGroup.MarginLayoutParams marginLayoutParams3222 = (ViewGroup.MarginLayoutParams) c84992XXg.LJLILLLLZI.getLayoutParams();
                            int LIZJ3222 = (int) KL2.LIZJ(c84992XXg.LJLILLLLZI.getContext(), 2.0f);
                            marginLayoutParams3222.topMargin = LIZJ3222;
                            marginLayoutParams3222.leftMargin = LIZJ3222;
                            c84992XXg.LJLILLLLZI.setImageResource(i2);
                            break;
                        case 7:
                            i2 = R.drawable.bl2;
                            ViewGroup.MarginLayoutParams marginLayoutParams32222 = (ViewGroup.MarginLayoutParams) c84992XXg.LJLILLLLZI.getLayoutParams();
                            int LIZJ32222 = (int) KL2.LIZJ(c84992XXg.LJLILLLLZI.getContext(), 2.0f);
                            marginLayoutParams32222.topMargin = LIZJ32222;
                            marginLayoutParams32222.leftMargin = LIZJ32222;
                            c84992XXg.LJLILLLLZI.setImageResource(i2);
                            break;
                        case 8:
                            i2 = R.drawable.bl3;
                            ViewGroup.MarginLayoutParams marginLayoutParams322222 = (ViewGroup.MarginLayoutParams) c84992XXg.LJLILLLLZI.getLayoutParams();
                            int LIZJ322222 = (int) KL2.LIZJ(c84992XXg.LJLILLLLZI.getContext(), 2.0f);
                            marginLayoutParams322222.topMargin = LIZJ322222;
                            marginLayoutParams322222.leftMargin = LIZJ322222;
                            c84992XXg.LJLILLLLZI.setImageResource(i2);
                            break;
                        case 9:
                            i2 = R.drawable.bkt;
                            ViewGroup.MarginLayoutParams marginLayoutParams3222222 = (ViewGroup.MarginLayoutParams) c84992XXg.LJLILLLLZI.getLayoutParams();
                            int LIZJ3222222 = (int) KL2.LIZJ(c84992XXg.LJLILLLLZI.getContext(), 2.0f);
                            marginLayoutParams3222222.topMargin = LIZJ3222222;
                            marginLayoutParams3222222.leftMargin = LIZJ3222222;
                            c84992XXg.LJLILLLLZI.setImageResource(i2);
                            break;
                        case 10:
                            i2 = R.drawable.bku;
                            ViewGroup.MarginLayoutParams marginLayoutParams32222222 = (ViewGroup.MarginLayoutParams) c84992XXg.LJLILLLLZI.getLayoutParams();
                            int LIZJ32222222 = (int) KL2.LIZJ(c84992XXg.LJLILLLLZI.getContext(), 2.0f);
                            marginLayoutParams32222222.topMargin = LIZJ32222222;
                            marginLayoutParams32222222.leftMargin = LIZJ32222222;
                            c84992XXg.LJLILLLLZI.setImageResource(i2);
                            break;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                            i2 = R.drawable.bkv;
                            ViewGroup.MarginLayoutParams marginLayoutParams322222222 = (ViewGroup.MarginLayoutParams) c84992XXg.LJLILLLLZI.getLayoutParams();
                            int LIZJ322222222 = (int) KL2.LIZJ(c84992XXg.LJLILLLLZI.getContext(), 2.0f);
                            marginLayoutParams322222222.topMargin = LIZJ322222222;
                            marginLayoutParams322222222.leftMargin = LIZJ322222222;
                            c84992XXg.LJLILLLLZI.setImageResource(i2);
                            break;
                    }
                } else {
                    c84992XXg.LJLILLLLZI.setVisibility(8);
                }
            }
            XTE xte = this.LJLJJLL;
            musicModel.getLogPb();
            xte.getClass();
            XTE xte2 = this.LJLJJLL;
            xte2.LIZJ = "normal_search";
            String musicId = musicModel.getMusicId();
            boolean z3 = this.LJLJLJ;
            musicModel.getMatchedPGCSoundInfo();
            SFS.LJJIII(xte2, musicId, i, z3);
        }
    }

    @Override // X.C4II
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        if (i != 0) {
            if (i != 2) {
                return new C84992XXg(C28289B8j.LIZ(viewGroup, R.layout.bgb, viewGroup, false));
            }
            throw null;
        }
        C85022XYk c85022XYk = new C85022XYk(C28289B8j.LIZ(viewGroup, R.layout.bg8, viewGroup, false), this.LJLJLLL);
        XX8 xx8 = this.LJLL;
        InterfaceC85019XYh<XYN> interfaceC85019XYh = this.LJLILLLLZI;
        c85022XYk.LLD = xx8;
        c85022XYk.LLF = interfaceC85019XYh;
        return c85022XYk;
    }
}
