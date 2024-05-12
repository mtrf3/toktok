package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class XZC extends C8HS<MusicModel> {
    public final InterfaceC82734WdW LJLIL;
    public final InterfaceC149485to LJLILLLLZI;
    public final C145255mz LJLJI;
    public final XZU LJLJJI;
    public int LJLJJL;

    public final String LJLLLLLL() {
        InterfaceC65784Pro<String> interfaceC65784Pro = this.LJLJI.LIZJ;
        if (interfaceC65784Pro != null) {
            return interfaceC65784Pro.invoke();
        }
        AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(this.LJLILLLLZI.LIZIZ());
        if (extractAVMusic != null) {
            return extractAVMusic.getMusicId();
        }
        return null;
    }

    public final boolean LJLZ(MusicModel musicModel) {
        if (musicModel == null) {
            return false;
        }
        return o.LJ(LJLLLLLL(), musicModel.getMusicId());
    }

    public final void LJZ(int i) {
        this.LJLJJL = i;
        if (!C78886Uxe.LJJIJ(this.mmItems)) {
            notifyDataSetChanged();
        }
    }

    @Override // X.C4II
    public final int getBasicItemViewType(int i) {
        MusicModel musicModel;
        List<T> list = this.mmItems;
        if (list != 0 && (musicModel = (MusicModel) ORZ.LJLLLLLL(i, list)) != null) {
            if (musicModel.getMusicItemType() == MusicModel.MusicItemType.MUSIC_SECTION_TITLE) {
                return 1;
            }
            if (musicModel.getMusicType() == MusicModel.MusicType.SPEECH2SONG) {
                return 2;
            }
        }
        return 0;
    }

    @Override // X.MK7, X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override // X.C4II
    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        MusicModel musicModel;
        boolean z;
        int i2;
        XZU xzu;
        int i3;
        XZU xzu2;
        o.LJIIIZ(viewHolder, "viewHolder");
        List<T> list = this.mmItems;
        if (list != 0) {
            musicModel = (MusicModel) ORZ.LJLLLLLL(i, list);
        } else {
            musicModel = null;
        }
        boolean z2 = true;
        int i4 = 0;
        if (viewHolder instanceof C82733WdV) {
            C82733WdV c82733WdV = (C82733WdV) viewHolder;
            boolean LJLZ = LJLZ(musicModel);
            if (this.LJLJJL != i) {
                z2 = false;
            }
            c82733WdV.L(musicModel, LJLZ, z2);
            if (musicModel != null) {
                this.LJLIL.LJ(musicModel, i);
                return;
            }
            return;
        }
        if (!(viewHolder instanceof XZL) || musicModel == null) {
            return;
        }
        XZL xzl = (XZL) viewHolder;
        boolean LJLZ2 = LJLZ(musicModel);
        if (this.LJLJJL == i) {
            z = true;
        } else {
            z = false;
        }
        xzl.LJLJJLL.setText(musicModel.getName());
        xzl.LJLILLLLZI = LJLZ2;
        xzl.LJLJI = z;
        switch (musicModel.getMusicStatus()) {
            case 10:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                xzl.LJLJL.setVisibility(8);
                xzl.LJLJLJ.setVisibility(8);
                break;
            case 12:
                xzl.LJLJL.setVisibility(8);
                xzl.LJLJLJ.setVisibility(0);
                if (!z && (xzu = xzl.LJLIL) != null) {
                    xzu.LIZIZ();
                    break;
                }
                break;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                TuxIconView tuxIconView = xzl.LJLJL;
                if (C167486hk.LIZ()) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                tuxIconView.setVisibility(i2);
                xzl.LJLJLJ.setVisibility(8);
                break;
            default:
                H7B.LIZJ("Unexpected music status!");
                break;
        }
        if (LJLZ2 || ((xzu2 = xzl.LJLIL) != null && xzu2.LIZ())) {
            if (QXF.LIZLLL()) {
                xzl.LJLJJI.setVisibility(0);
                xzl.LJLJJI.playAnimation();
                View view = xzl.LJLJJL;
                Integer LIZIZ = C19N.LIZIZ(view, "it.context", R.attr.d2);
                if (LIZIZ != null) {
                    i3 = LIZIZ.intValue();
                } else {
                    i3 = 0;
                }
                view.setBackgroundColor(i3);
                xzl.LJLJJLL.setTextColorRes(R.attr.dj);
            } else {
                xzl.LJLJJLL.setTextColorRes(R.attr.eb);
            }
            xzl.LJLJLLL.setVisibility(0);
            return;
        }
        if (QXF.LIZLLL()) {
            xzl.LJLJJI.setVisibility(8);
            View view2 = xzl.LJLJJL;
            Integer LIZIZ2 = C19N.LIZIZ(view2, "it.context", R.attr.h0);
            if (LIZIZ2 != null) {
                i4 = LIZIZ2.intValue();
            }
            view2.setBackgroundColor(i4);
        }
        xzl.LJLJJLL.setTextColorRes(R.attr.dj);
        xzl.LJLJLLL.setVisibility(8);
    }

    @Override // X.C4II
    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        o.LJIIIZ(viewGroup, "viewGroup");
        if (i != 1) {
            if (i != 2) {
                return new C82733WdV(this.LJLJI, C1FL.LIZIZ(viewGroup, R.layout.drl, viewGroup, false, "inflater.inflate(R.layou…music_new, parent, false)"), this.LJLIL, C52536Kjc.LIZIZ(), C52536Kjc.LIZ());
            }
            return new XZL(C1FL.LIZIZ(viewGroup, R.layout.cpf, viewGroup, false, "inflater.inflate(R.layou…em_layout, parent, false)"), this.LJLJJI);
        }
        return new XZY(C1FL.LIZIZ(viewGroup, R.layout.je, viewGroup, false, "inflater.inflate(R.layou…sic_title, parent, false)"), this.LJLIL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XZC(InterfaceC82734WdW interfaceC82734WdW, InterfaceC149485to musicDataUpdateListener, C145255mz musicPanelViewHolderParam, XZU xzu) {
        super(false, 1, null);
        o.LJIIIZ(musicDataUpdateListener, "musicDataUpdateListener");
        o.LJIIIZ(musicPanelViewHolderParam, "musicPanelViewHolderParam");
        this.LJLIL = interfaceC82734WdW;
        this.LJLILLLLZI = musicDataUpdateListener;
        this.LJLJI = musicPanelViewHolderParam;
        this.LJLJJI = xzu;
        this.LJLJJL = -1;
    }
}
