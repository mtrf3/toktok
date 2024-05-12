package X;

import android.view.View;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.liveevent.LiveEventModule;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Gpz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42739Gpz extends AbstractC42769GqT<LiveEventModule, C42739Gpz>.a {
    public final SmartImageView LJLIL;
    public final TextView LJLILLLLZI;
    public final TextView LJLJI;
    public final C63044Ooi LJLJJI;
    public final View LJLJJL;
    public final /* synthetic */ C42738Gpy LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42739Gpz(C42738Gpy c42738Gpy, View view) {
        super(c42738Gpy, view);
        this.LJLJJLL = c42738Gpy;
        this.LJLIL = (SmartImageView) view.findViewById(R.id.ebx);
        this.LJLILLLLZI = (TextView) view.findViewById(R.id.lwu);
        this.LJLJI = (TextView) view.findViewById(R.id.m4n);
        this.LJLJJI = (C63044Ooi) view.findViewById(R.id.b_i);
        this.LJLJJL = view.findViewById(R.id.frt);
    }
}
