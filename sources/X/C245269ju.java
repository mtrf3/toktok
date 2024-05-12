package X;

import Y.ARunnableS1S0500000_3;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.mix.model.MixStatisStruct;
import com.ss.android.ugc.aweme.mix.model.MixStruct;
import com.ss.android.ugc.aweme.mix.platform.PlaylistBottomBarComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.9ju, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C245269ju extends AbstractC65781Prl implements InterfaceC88471Ynr<C3C8, MixStruct, C76800UCe> {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ TextView LJLILLLLZI;
    public final /* synthetic */ PlaylistBottomBarComponent LJLJI;
    public final /* synthetic */ TextView LJLJJI;
    public final /* synthetic */ View LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C245269ju(View view, TextView textView, PlaylistBottomBarComponent playlistBottomBarComponent, TextView textView2, View view2) {
        super(2);
        this.LJLIL = view;
        this.LJLILLLLZI = textView;
        this.LJLJI = playlistBottomBarComponent;
        this.LJLJJI = textView2;
        this.LJLJJL = view2;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(C3C8 selectSubscribe, MixStruct mixStruct) {
        String name;
        MixStatisStruct statis;
        String str;
        Float f;
        TextPaint paint;
        String str2;
        Resources resources;
        View view;
        MixStruct mixStruct2 = mixStruct;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (mixStruct2 == null && (view = this.LJLIL) != null) {
            view.setVisibility(8);
        }
        String str3 = null;
        if (mixStruct2 != null && (statis = mixStruct2.getStatis()) != null) {
            int total = statis.getTotal();
            PlaylistBottomBarComponent playlistBottomBarComponent = this.LJLJI;
            TextView textView = this.LJLJJI;
            View view2 = this.LJLJJL;
            TextView textView2 = this.LJLILLLLZI;
            Context context = playlistBottomBarComponent.getContext();
            if (context != null && (resources = context.getResources()) != null) {
                str = resources.getQuantityString(R.plurals.jv, total, Integer.valueOf(total));
            } else {
                str = null;
            }
            if (textView != null && (paint = textView.getPaint()) != null) {
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                f = Float.valueOf(paint.measureText(str2));
            } else {
                f = null;
            }
            if (view2 != null) {
                view2.post(new ARunnableS1S0500000_3(f, view2, textView2, textView, view2, 0));
            }
            if (textView != null) {
                textView.setText(str);
            }
        }
        TextView textView3 = this.LJLILLLLZI;
        if (textView3 != null) {
            if (mixStruct2 != null) {
                str3 = mixStruct2.getName();
            }
            textView3.setText(str3);
        }
        if (mixStruct2 == null || (name = mixStruct2.getName()) == null || name.length() == 0 || mixStruct2 == null || mixStruct2.getStatis() == null) {
            View view3 = this.LJLIL;
            if (view3 != null) {
                view3.setVisibility(8);
            }
        } else {
            View view4 = this.LJLIL;
            if (view4 != null) {
                view4.setVisibility(0);
            }
        }
        return C76800UCe.LIZ;
    }
}
