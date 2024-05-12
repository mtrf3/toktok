package com.ss.android.ugc.aweme.story.feed.immersive.component;

import X.C17N;
import X.C221108m2;
import X.C55096Ljo;
import X.C62822Ol8;
import X.C63081OpJ;
import X.InterfaceC55235Lm3;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.story.feed.immersive.ability.StoryProhibitedTipAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryProhibitedTipComponent extends BaseCellSlotComponent<StoryProhibitedTipComponent> implements StoryProhibitedTipAbility {
    public final C62822Ol8 LLFII;
    public final C62822Ol8 LLFZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.cp0;
    }

    public StoryProhibitedTipComponent() {
        new LinkedHashMap();
        this.LLFII = C221108m2.LIZIZ(new AqS153S0100000_3(this, 969));
        this.LLFZ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 970));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void Z3() {
        InterfaceC55235Lm3 interfaceC55235Lm3 = (InterfaceC55235Lm3) this.LLFII.getValue();
        if (interfaceC55235Lm3 != null) {
            C55096Ljo.LJIILL(interfaceC55235Lm3, StoryProhibitedTipAbility.class, null);
        }
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
    }

    @Override // com.ss.android.ugc.aweme.story.feed.immersive.ability.StoryProhibitedTipAbility
    public final void id0(String str) {
        View view;
        int i = 0;
        if ((str == null || str.length() == 0) && (view = (View) this.LLFZ.getValue()) != null) {
            C17N.LJJIIJZLJL(view);
        }
        View view2 = (View) this.LLFZ.getValue();
        if (view2 != null) {
            C17N.LJJLIIIJJI(view2);
        }
        TextView textView = (TextView) this.LLFZ.getValue();
        if (textView != null) {
            Context context = getContext();
            if (context != null) {
                i = C63081OpJ.LJJJJL(context);
            }
            textView.setWidth((int) (i * 0.56f));
        }
        TextView textView2 = (TextView) this.LLFZ.getValue();
        if (textView2 == null) {
            return;
        }
        textView2.setText(str);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        InterfaceC55235Lm3 interfaceC55235Lm3 = (InterfaceC55235Lm3) this.LLFII.getValue();
        if (interfaceC55235Lm3 != null) {
            C55096Ljo.LJIIJJI(interfaceC55235Lm3, this, StoryProhibitedTipAbility.class, null);
        }
    }
}
