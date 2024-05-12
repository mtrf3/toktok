package com.ss.android.ugc.aweme.feed.assem.caption;

import X.C221108m2;
import X.C37179EiV;
import X.C51029K0z;
import X.C62822Ol8;
import X.C78996UzQ;
import X.C90R;
import Y.ARunnableS9S0110000_3;
import Y.IDLListenerS191S0100000_3;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Space;
import com.ss.android.ugc.aweme.feed.assem.ability.IStickerAbility;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility;
import com.ss.android.ugc.feed.platform.cell.component.stickermanager.CellStickerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PlaceHolderCaptionAssem extends BaseCellContentComponent<PlaceHolderCaptionAssem> {
    public int LL;
    public Space LLD;
    public final C62822Ol8 LLF;
    public final C62822Ol8 LLFF;
    public final C62822Ol8 LLFFF;
    public final IDLListenerS191S0100000_3 LLFII;

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8XO
    public final void unBind() {
    }

    public PlaceHolderCaptionAssem() {
        new LinkedHashMap();
        this.LLF = C221108m2.LIZIZ(new AqS153S0100000_3(this, 296));
        this.LLFF = C221108m2.LIZIZ(new AqS153S0100000_3(this, 297));
        this.LLFFF = C221108m2.LIZIZ(new AqS153S0100000_3(this, 295));
        this.LLFII = new IDLListenerS191S0100000_3(this, 4);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8XO
    public final void LLLZIIL() {
        C37179EiV.LIZ().post(new ARunnableS9S0110000_3(this, false, 6));
    }

    public final int b4() {
        String str;
        String str2;
        String str3;
        FrameLayout Pj;
        Number number = 0;
        if (a1().LIZ == 4 && C78996UzQ.LJJIIZI(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme())) {
            BaseFeedPageParams baseFeedPageParams = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).baseFeedPageParams;
            String str4 = null;
            if (baseFeedPageParams != null) {
                str = baseFeedPageParams.eventType;
            } else {
                str = null;
            }
            if (!TextUtils.equals("homepage_follow", str)) {
                BaseFeedPageParams baseFeedPageParams2 = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).baseFeedPageParams;
                if (baseFeedPageParams2 != null) {
                    str2 = baseFeedPageParams2.eventType;
                } else {
                    str2 = null;
                }
                if (!TextUtils.equals("homepage_hot", str2)) {
                    BaseFeedPageParams baseFeedPageParams3 = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).baseFeedPageParams;
                    if (baseFeedPageParams3 != null) {
                        str3 = baseFeedPageParams3.eventType;
                    } else {
                        str3 = null;
                    }
                    if (!TextUtils.equals("homepage_nearby", str3)) {
                        BaseFeedPageParams baseFeedPageParams4 = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).baseFeedPageParams;
                        if (baseFeedPageParams4 != null) {
                            str4 = baseFeedPageParams4.eventType;
                        }
                        if (!TextUtils.equals("homepage_friends", str4)) {
                            IStickerAbility iStickerAbility = (IStickerAbility) this.LLF.getValue();
                            if (iStickerAbility != null && (Pj = iStickerAbility.Pj()) != null) {
                                number = Float.valueOf(Pj.getY());
                            }
                            return number.intValue();
                        }
                    }
                }
            }
        }
        Space space = this.LLD;
        if (space != null) {
            number = Float.valueOf(space.getY());
        }
        return number.intValue();
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
    }

    public final void Xw(int i) {
        int i2;
        if (C90R.LIZ()) {
            CellStickerComponentAbility cellStickerComponentAbility = (CellStickerComponentAbility) this.LLFF.getValue();
            if (cellStickerComponentAbility != null) {
                RootCellCommonAbility rootCellCommonAbility = (RootCellCommonAbility) this.LLFFF.getValue();
                if (rootCellCommonAbility != null) {
                    i2 = rootCellCommonAbility.vC();
                } else {
                    i2 = 0;
                }
                cellStickerComponentAbility.ac0(i, i2);
                return;
            }
            return;
        }
        IStickerAbility iStickerAbility = (IStickerAbility) this.LLF.getValue();
        if (iStickerAbility == null) {
            return;
        }
        iStickerAbility.Xw(i);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent
    /* renamed from: a4 */
    public final void n3(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        C37179EiV.LIZ().post(new ARunnableS9S0110000_3(this, true, 6));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8XO
    public final /* bridge */ /* synthetic */ void n3(Object obj) {
        n3((VideoItemParams) obj);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LLD = (Space) view.findViewById(R.id.hqv);
    }
}
