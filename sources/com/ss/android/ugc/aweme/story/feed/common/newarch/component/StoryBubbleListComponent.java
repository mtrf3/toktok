package com.ss.android.ugc.aweme.story.feed.common.newarch.component;

import X.C215178cT;
import X.C221138m5;
import X.C222588oQ;
import X.C2304092m;
import X.C2K0;
import X.C53578L1a;
import X.C54838Lfe;
import X.C55096Ljo;
import X.C76A;
import X.C79T;
import X.InterfaceC209288Jg;
import X.InterfaceC55100Ljs;
import X.InterfaceC55102Lju;
import X.InterfaceC55235Lm3;
import X.KR8;
import X.M89;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.comment.service.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.story.feed.common.newarch.ability.CommonCellAbility;
import com.ss.android.ugc.aweme.story.feed.common.newarch.ability.StoryBubbleListAbility;
import com.ss.android.ugc.aweme.story.feed.common.newarch.ability.StoryCollectionCellAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryBubbleListComponent extends BaseCellContentComponent implements StoryBubbleListAbility, InterfaceC55102Lju {
    public boolean LL;
    public ViewGroup LLD;
    public InterfaceC209288Jg LLF;
    public C222588oQ LLFF;
    public final C221138m5 LLFFF;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 1810706519) {
            return null;
        }
        return this;
    }

    public StoryBubbleListComponent() {
        new LinkedHashMap();
        this.LLFFF = KR8.LJIIJJI(new AqS153S0100000_3(this, 902));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void LJJJJ() {
        InterfaceC209288Jg interfaceC209288Jg = this.LLF;
        if (interfaceC209288Jg != null) {
            interfaceC209288Jg.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void LLIILZL() {
        InterfaceC209288Jg interfaceC209288Jg = this.LLF;
        if (interfaceC209288Jg != null) {
            interfaceC209288Jg.LJJIIZ();
        }
    }

    public final C222588oQ b4() {
        C222588oQ c222588oQ = this.LLFF;
        if (c222588oQ != null) {
            return c222588oQ;
        }
        o.LJIJI("params");
        throw null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        Integer valueOf;
        InterfaceC55100Ljs mi0;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        if (C54838Lfe.LJJ(item.getAweme())) {
            return;
        }
        if (this.LL && (valueOf = Integer.valueOf(b4().LJIILJJIL)) != null && valueOf.intValue() == 13 && (C215178cT.LJIL(b4().LJ.param) || C215178cT.LJIJJLI(b4().LJ.param))) {
            if (this.LLF == null) {
                CommonCellAbility commonCellAbility = (CommonCellAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), CommonCellAbility.class, null);
                if (commonCellAbility != null && (mi0 = commonCellAbility.mi0()) != null) {
                    C55096Ljo.LJIJ(mi0);
                }
                ViewGroup viewGroup = this.LLD;
                if (viewGroup != null) {
                    CommentService LJJL = CommentServiceImpl.LJJL();
                    C79T c79t = new C79T(viewGroup, b4().LIZJ);
                    c79t.LIZJ = b4().LJIIIZ;
                    c79t.LIZLLL = Integer.valueOf(b4().LJIIJ);
                    InterfaceC55235Lm3 scope = C55096Ljo.LJIIZILJ(this);
                    o.LJIIIZ(scope, "scope");
                    c79t.LJ = scope;
                    c79t.LJFF = C2304092m.LIZ() ? 1 : 0;
                    this.LLF = LJJL.LJJJJLI(c79t.LIZ());
                }
            }
            InterfaceC209288Jg interfaceC209288Jg = this.LLF;
            if (interfaceC209288Jg != null) {
                interfaceC209288Jg.LJJII();
            }
        }
        Aweme aweme = item.getAweme();
        o.LJIIIIZZ(aweme, "item.aweme");
        if (C54838Lfe.LJIILL(aweme)) {
            InterfaceC209288Jg interfaceC209288Jg2 = this.LLF;
            if (interfaceC209288Jg2 == null) {
                return;
            }
            interfaceC209288Jg2.LJIIZILJ();
            return;
        }
        if (!TextUtils.isEmpty(aweme.getAid())) {
            InterfaceC209288Jg interfaceC209288Jg3 = this.LLF;
            if (interfaceC209288Jg3 == null) {
                return;
            }
            interfaceC209288Jg3.LIZLLL(aweme);
            return;
        }
        InterfaceC209288Jg interfaceC209288Jg4 = this.LLF;
        if (interfaceC209288Jg4 == null) {
            return;
        }
        interfaceC209288Jg4.LJIIZILJ();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void LJJIII(int i) {
        InterfaceC209288Jg interfaceC209288Jg = this.LLF;
        if (interfaceC209288Jg != null) {
            interfaceC209288Jg.onPause();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void LJJIJIIJIL(int i) {
        InterfaceC209288Jg interfaceC209288Jg = this.LLF;
        if (interfaceC209288Jg != null) {
            interfaceC209288Jg.onResume();
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ViewGroup viewGroup;
        o.LJIIIZ(view, "view");
        StoryCollectionCellAbility storyCollectionCellAbility = (StoryCollectionCellAbility) this.LLFFF.getValue();
        if (storyCollectionCellAbility != null) {
            viewGroup = storyCollectionCellAbility.KM();
        } else {
            viewGroup = null;
        }
        this.LLD = viewGroup;
        C53578L1a.LIZ.getClass();
        if (!C53578L1a.LIZ()) {
            ViewGroup viewGroup2 = this.LLD;
            if (viewGroup2 == null) {
                return;
            }
            viewGroup2.setVisibility(8);
            return;
        }
        M89 m89 = b4().LJ.param;
        Integer valueOf = Integer.valueOf(b4().LJIILJJIL);
        if (valueOf == null || valueOf.intValue() != 13 || !C76A.LIZ() || !C53578L1a.LIZ() || (!C215178cT.LJIL(m89) && !C215178cT.LJIJJLI(m89))) {
            ViewGroup viewGroup3 = this.LLD;
            if (viewGroup3 == null) {
                return;
            }
            viewGroup3.setVisibility(8);
            return;
        }
        ViewGroup viewGroup4 = this.LLD;
        if (viewGroup4 != null) {
            viewGroup4.setVisibility(0);
        }
        this.LL = true;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void B2(int i, Aweme aweme) {
        C54838Lfe.LJJ(aweme);
    }
}
