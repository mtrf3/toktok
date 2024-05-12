package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.notification.cell.NoticeChannelInfoCell;

/* renamed from: X.8I4, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8I4 extends RecyclerView.ViewHolder {
    public final SYL LJLIL;

    public C8I4(SYL syl) {
        super(syl);
        this.LJLIL = syl;
        syl.setClipToPadding(false);
        syl.setLayoutParams(new ViewGroup.LayoutParams(-1, C7MY.LIZIZ(102)));
        syl.getContext();
        syl.setLayoutManager(new LinearLayoutManager(0, false));
        syl.LLLF.LJZL(NoticeChannelInfoCell.class);
    }
}
