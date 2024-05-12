package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;

/* renamed from: X.XXc, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84988XXc extends RecyclerView.ViewHolder {
    public final SmartImageView LJLIL;
    public final ImageView LJLILLLLZI;
    public final ImageView LJLJI;
    public final TextView LJLJJI;
    public final TextView LJLJJL;
    public final TextView LJLJJLL;
    public final Context LJLJL;
    public MusicModel LJLJLJ;
    public int LJLJLLL;
    public boolean LJLL;

    public C84988XXc(View view) {
        super(view);
        this.LJLJL = view.getContext();
        this.LJLIL = (SmartImageView) view.findViewById(R.id.f12);
        this.LJLILLLLZI = (ImageView) view.findViewById(R.id.f86);
        this.LJLJI = (ImageView) view.findViewById(R.id.f7a);
        this.LJLJJI = (TextView) view.findViewById(R.id.mby);
        this.LJLJJL = (TextView) view.findViewById(R.id.mkc);
        this.LJLJJLL = (TextView) view.findViewById(R.id.mbl);
        view.findViewById(R.id.f7b);
        view.findViewById(R.id.mcc);
    }
}
