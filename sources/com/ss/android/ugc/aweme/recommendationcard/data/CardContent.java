package com.ss.android.ugc.aweme.recommendationcard.data;

import X.EnumC62092c9;
import X.EnumC62112cB;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* loaded from: classes2.dex */
public final class CardContent {

    @InterfaceC65349Pkn("aweme_list")
    public final List<Aweme> awemeList;

    @InterfaceC65349Pkn("card_type")
    public final EnumC62112cB cardType;

    @InterfaceC65349Pkn("effect")
    public final EffectStructV2 effect;

    @InterfaceC65349Pkn("is_multi_card")
    public final Boolean isMultiCard;

    @InterfaceC65349Pkn("main_link")
    public final EnumC62092c9 mainLink;

    @InterfaceC65349Pkn("nickname_position")
    public final String nicknamePosition;

    @InterfaceC65349Pkn("use_count")
    public final Integer useCount;

    @InterfaceC65349Pkn("vide_link")
    public final EnumC62092c9 videoLink;

    /* JADX WARN: Multi-variable type inference failed */
    public CardContent(EnumC62112cB enumC62112cB, List<? extends Aweme> list, Integer num, Boolean bool, EnumC62092c9 enumC62092c9, EnumC62092c9 enumC62092c92, EffectStructV2 effectStructV2, String str) {
        this.cardType = enumC62112cB;
        this.awemeList = list;
        this.useCount = num;
        this.isMultiCard = bool;
        this.mainLink = enumC62092c9;
        this.videoLink = enumC62092c92;
        this.effect = effectStructV2;
        this.nicknamePosition = str;
    }
}
