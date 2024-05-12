package X;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.kids.choosemusic.activity.MusicDetailListActivity;
import com.ss.android.ugc.aweme.kids.choosemusic.widgets.MusicClassWidget;
import com.ss.android.ugc.aweme.kids.music.model.MusicCollectionItem;
import com.zhiliaoapp.musically.R;

/* loaded from: classes16.dex */
public final class XXO extends RecyclerView.ViewHolder implements View.OnClickListener {
    public final TextView LJLIL;
    public final C62846OlW LJLILLLLZI;
    public MusicCollectionItem LJLJI;
    public final C85025XYn LJLJJI;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MusicCollectionItem musicCollectionItem;
        C85025XYn c85025XYn;
        if (!C6ZT.LIZ(view) && (musicCollectionItem = this.LJLJI) != null && this.itemView != null && (c85025XYn = this.LJLJJI) != null) {
            MusicClassWidget musicClassWidget = c85025XYn.LIZ;
            musicClassWidget.getClass();
            Intent intent = new Intent(musicClassWidget.LJLIL, (Class<?>) MusicDetailListActivity.class);
            intent.putExtra("music_type", 2);
            intent.putExtra("music_class_id", musicCollectionItem.mcId);
            intent.putExtra("music_class_name", musicCollectionItem.mcName);
            intent.putExtra("music_category_is_hot", musicCollectionItem.isHot);
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", musicClassWidget.LJLLI);
            intent.putExtra("music_class_enter_method", "click_category_list");
            intent.putExtra("music_class_level", musicCollectionItem.level);
            musicClassWidget.LJIILIIL(intent, musicClassWidget.LJLL);
            SFS.LJJII(musicCollectionItem.mcName, "click_category_list", "", "change_music_page", musicCollectionItem.mcId);
        }
    }

    public XXO(View view, int i, C85025XYn c85025XYn) {
        super(view);
        this.LJLIL = (TextView) view.findViewById(R.id.m2d);
        this.LJLILLLLZI = (C62846OlW) view.findViewById(R.id.f0c);
        C16880lQ.LJIIJ(this, this.itemView);
        this.LJLJJI = c85025XYn;
    }
}
