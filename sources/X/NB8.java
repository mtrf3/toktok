package X;

import Y.ACListenerS30S0100000_10;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NB8 extends LinearLayout {
    public TuxTextView LJLIL;
    public C62846OlW LJLILLLLZI;
    public MusicCollectionItem LJLJI;
    public N9A LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NB8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i;
        a1.LJFF(context, "context");
        setOrientation(1);
        setClipChildren(false);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        if (C00F.LIZ(31744, 0, "music_pick_page_type", true) == 2) {
            i = R.layout.bcr;
        } else {
            i = R.layout.bd6;
        }
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), i, this, true);
        this.LJLIL = (TuxTextView) findViewById(R.id.m2d);
        this.LJLILLLLZI = (C62846OlW) findViewById(R.id.f0c);
        setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS30S0100000_10(this, 225)));
    }

    public final void LIZ(int i, N9A n9a, MusicCollectionItem item) {
        UrlModel urlModel;
        o.LJIIIZ(item, "item");
        this.LJLJI = item;
        TuxTextView tuxTextView = this.LJLIL;
        if (tuxTextView != null) {
            String str = item.mcName;
            if (str == null) {
                str = "";
            }
            tuxTextView.setText(str);
        }
        C62846OlW c62846OlW = this.LJLILLLLZI;
        MusicCollectionItem musicCollectionItem = this.LJLJI;
        if (musicCollectionItem != null) {
            urlModel = musicCollectionItem.awemeCover;
        } else {
            urlModel = null;
        }
        C78765Uvh.LJFF(c62846OlW, urlModel);
        this.LJLJJI = n9a;
    }
}
