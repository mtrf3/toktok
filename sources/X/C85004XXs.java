package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.zhiliaoapp.musically.R;

/* renamed from: X.XXs, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85004XXs extends C8HS<MusicCollectionItem> {
    public C85028XYq LJLIL;

    @Override // X.C4II
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        MusicCollectionItem musicCollectionItem;
        C85005XXt c85005XXt = (C85005XXt) viewHolder;
        if (C79004UzY.LJJIFFI(this.mmItems) || i < 0 || i >= this.mmItems.size() || (musicCollectionItem = (MusicCollectionItem) ListProtector.get(this.mmItems, i)) == null) {
            c85005XXt.getClass();
            return;
        }
        c85005XXt.LJLJI = musicCollectionItem;
        C78765Uvh.LJFF(c85005XXt.LJLIL, musicCollectionItem.cover);
        c85005XXt.LJLILLLLZI.setText(musicCollectionItem.mcName);
    }

    @Override // X.C4II
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        return new C85005XXt(this, C28289B8j.LIZ(viewGroup, R.layout.bd4, viewGroup, false));
    }
}
