package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.kids.music.model.MusicCollectionItem;
import com.zhiliaoapp.musically.R;

/* renamed from: X.6Ew, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C157186Ew extends C8HS<MusicCollectionItem> {
    public C30116Brs LJLIL;

    @Override // X.C4II
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        MusicCollectionItem musicCollectionItem;
        C157176Ev c157176Ev = (C157176Ev) viewHolder;
        if (C79004UzY.LJJIFFI(this.mmItems) || i < 0 || i >= this.mmItems.size() || (musicCollectionItem = (MusicCollectionItem) ListProtector.get(this.mmItems, i)) == null) {
            c157176Ev.getClass();
            return;
        }
        c157176Ev.LJLJI = musicCollectionItem;
        C78765Uvh.LJFF(c157176Ev.LJLIL, musicCollectionItem.cover);
        c157176Ev.LJLILLLLZI.setText(musicCollectionItem.mcName);
    }

    @Override // X.C4II
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        return new C157176Ev(this, C28289B8j.LIZ(viewGroup, R.layout.bge, viewGroup, false));
    }
}
