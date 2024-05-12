package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XZJ extends XZC {
    public final InterfaceC82738Wda LJLJJLL;

    @Override // X.XZC, X.C4II
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        MusicModel musicModel;
        boolean z;
        o.LJIIIZ(viewHolder, "viewHolder");
        List<T> list = this.mmItems;
        if (list != 0) {
            musicModel = (MusicModel) ORZ.LJLLLLLL(i, list);
        } else {
            musicModel = null;
        }
        if (viewHolder instanceof C82737WdZ) {
            C82737WdZ c82737WdZ = (C82737WdZ) viewHolder;
            boolean LJLZ = LJLZ(musicModel);
            if (this.LJLJJL == i) {
                z = true;
            } else {
                z = false;
            }
            c82737WdZ.L(musicModel, LJLZ, z);
            c82737WdZ.LL = i;
            c82737WdZ.itemView.setBackgroundColor(0);
            if (musicModel != null) {
                this.LJLIL.LJ(musicModel, i);
            }
        }
    }

    @Override // X.XZC, X.C4II
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        o.LJIIIZ(viewGroup, "viewGroup");
        return new C82737WdZ(this.LJLJI, C1FL.LIZIZ(viewGroup, R.layout.drm, viewGroup, false, "inflater.inflate(R.layou…ew_recent, parent, false)"), this.LJLJJLL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XZJ(XZ9 xz9, InterfaceC149485to musicDataUpdateListener, C145255mz musicPanelViewHolderParam) {
        super(xz9, musicDataUpdateListener, musicPanelViewHolderParam, null);
        o.LJIIIZ(musicDataUpdateListener, "musicDataUpdateListener");
        o.LJIIIZ(musicPanelViewHolderParam, "musicPanelViewHolderParam");
        this.LJLJJLL = xz9;
    }
}
