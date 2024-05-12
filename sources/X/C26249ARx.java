package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.prompt.panel.PromptMainPageFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.ARx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26249ARx extends ASB {
    public final C62435Oet LJLJJI;

    @Override // X.ASG
    public final void LIZ(View v) {
        String str;
        FragmentManager supportFragmentManager;
        o.LJIIIZ(v, "v");
        Context context = this.LJLJJI.LJLJJL;
        Bundle bundle = new Bundle();
        bundle.putString("event_type", this.LJLJI);
        Aweme aweme = this.LJLILLLLZI;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        bundle.putString("current_aweme_id", str);
        bundle.putString("source_page", "panel");
        o.LJIIIZ(context, "context");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI == null || (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) == null) {
            return;
        }
        PromptMainPageFragment promptMainPageFragment = new PromptMainPageFragment();
        promptMainPageFragment.setArguments(bundle);
        ASL asl = new ASL();
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLLILLLL = promptMainPageFragment;
        tuxSheet.LJZI = false;
        tuxSheet.LJLJI = true;
        asl.LJI(1);
        asl.LJFF(32);
        Integer LJI = C79045V0n.LJI(R.attr.c9, context);
        TuxSheet tuxSheet2 = asl.LIZ;
        tuxSheet2.LJLJL = LJI;
        tuxSheet2.LJLILLLLZI = promptMainPageFragment;
        tuxSheet2.show(supportFragmentManager, "PromptMainPageFragment");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26249ARx(C62435Oet actionsManager, AS3 as3) {
        super(actionsManager, as3);
        o.LJIIIZ(actionsManager, "actionsManager");
        this.LJLJJI = actionsManager;
    }

    @Override // X.ASG
    public final void LIZJ(ImageView iconView, View view, int i) {
        o.LJIIIZ(iconView, "iconView");
        C26244ARs.LIZIZ(this.LJLJI, "long_press");
    }
}
