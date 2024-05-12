package X;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.livewallpaper.ui.LiveWallPaperPreviewActivity;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public final class TAV extends BaseAdapter {
    public final Context LJLIL;
    public final List<TAW> LJLILLLLZI;
    public final SparseArray LJLJI;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.LJLILLLLZI.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return ListProtector.get(this.LJLILLLLZI, i);
    }

    public TAV(LiveWallPaperPreviewActivity liveWallPaperPreviewActivity, List list) {
        this.LJLIL = liveWallPaperPreviewActivity;
        this.LJLILLLLZI = list;
        this.LJLJI = new SparseArray(((ArrayList) list).size());
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        if (view == null) {
            view = View.inflate(this.LJLIL, R.layout.c3u, null);
        }
        TAW taw = (TAW) ListProtector.get(this.LJLILLLLZI, i);
        TextView textView = (TextView) view.findViewById(R.id.m9p);
        this.LJLJI.put(i, taw.LIZ);
        View findViewById = view.findViewById(R.id.gn1);
        textView.setText(taw.LIZ);
        if (taw.LIZIZ) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        findViewById.setVisibility(i2);
        return view;
    }
}
