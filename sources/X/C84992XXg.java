package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;

/* renamed from: X.XXg, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84992XXg extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LJLL = 0;
    public final SmartImageView LJLIL;
    public final ImageView LJLILLLLZI;
    public final TextView LJLJI;
    public final TextView LJLJJI;
    public final TextView LJLJJL;
    public final Context LJLJJLL;
    public MusicModel LJLJL;
    public int LJLJLJ;
    public boolean LJLJLLL;

    public C84992XXg(View view) {
        super(view);
        this.LJLJJLL = view.getContext();
        this.LJLIL = (SmartImageView) view.findViewById(R.id.f12);
        view.findViewById(R.id.f86);
        this.LJLILLLLZI = (ImageView) view.findViewById(R.id.f7a);
        this.LJLJI = (TextView) view.findViewById(R.id.mby);
        this.LJLJJI = (TextView) view.findViewById(R.id.mkc);
        this.LJLJJL = (TextView) view.findViewById(R.id.mbl);
        view.findViewById(R.id.f7b);
        view.findViewById(R.id.mcc);
    }
}
