package com.ss.android.ugc.aweme.feed.model.bottom.banner;

import X.C07250Qf;
import X.C113484cq;
import X.C2068389v;
import X.C61593OFh;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.OM7;
import X.V0N;
import X.W5F;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.zhiliaoapp.musically.R;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class FeedBottomBannerConfig {
    public final String bannerName;
    public final InterfaceC88472Yns<W5F, C76800UCe> iconLighten;
    public final Integer iconRes;
    public final IconType iconType;
    public final OM7 interactionAction;
    public final Callback interactionLayoutCallback;
    public final Integer interactionLayoutId;
    public final View interactionLayoutView;
    public final InteractionType interactionType;
    public final C2068389v titleEndIcon;
    public final InterfaceC88472Yns<View, C76800UCe> titleEndIconView;
    public final int titleMaxLine;
    public final boolean titleSyncSet;
    public final Set<String> whiteList;

    /* loaded from: classes11.dex */
    public static final class Builder {
        public final String bannerName;
        public Integer iconRes;
        public IconType iconType;
        public OM7 interactionAction;
        public Callback interactionLayoutCallback;
        public Integer interactionLayoutId;
        public View interactionLayoutView;
        public InteractionType interactionType;
        public InterfaceC88472Yns<? super W5F, C76800UCe> lightenImageRequestBuilder;
        public C2068389v titleEndIcon;
        public InterfaceC88472Yns<? super View, C76800UCe> titleEndIconView;
        public int titleMaxLine;
        public boolean titleSyncSet;
        public final Set<String> whiteList;

        public final FeedBottomBannerConfig build() {
            return new FeedBottomBannerConfig(this);
        }

        public final void setIconType$common_feed_api_release(IconType iconType) {
            o.LJIIIZ(iconType, "<set-?>");
            this.iconType = iconType;
        }

        public final Builder setIconWithLocalRes(int i) {
            this.iconType = IconType.LOCAL;
            this.iconRes = Integer.valueOf(i);
            return this;
        }

        public final Builder setIconWithRemoteLighten(InterfaceC88472Yns<? super W5F, C76800UCe> lighten) {
            o.LJIIIZ(lighten, "lighten");
            this.iconType = IconType.REMOTE;
            this.lightenImageRequestBuilder = lighten;
            return this;
        }

        public final void setInteractionType$common_feed_api_release(InteractionType interactionType) {
            o.LJIIIZ(interactionType, "<set-?>");
            this.interactionType = interactionType;
        }

        public final Builder setInteractionWithArrow(InterfaceC88472Yns<? super C113484cq, C76800UCe> block) {
            o.LJIIIZ(block, "block");
            OM7 om7 = new OM7() { // from class: X.4cq
                @Override // X.OM7
                public final boolean LIZ() {
                    return true;
                }

                @Override // X.OM7
                public final View LIZIZ(Context context) {
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
                    linearLayout.setOrientation(0);
                    TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
                    tuxIconView.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
                    C2068389v c2068389v = new C2068389v();
                    c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(16));
                    c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(16));
                    c2068389v.LIZ = R.raw.icon_chevron_right_offset_ltr;
                    c2068389v.LJ = Integer.valueOf(R.attr.dj);
                    tuxIconView.setTuxIcon(c2068389v);
                    linearLayout.addView(tuxIconView);
                    return linearLayout;
                }
            };
            block.invoke(om7);
            this.interactionAction = om7;
            this.interactionType = InteractionType.ARROW;
            return this;
        }

        public final Builder setInteractionWithButton(InterfaceC88472Yns<? super C61593OFh, C76800UCe> block) {
            o.LJIIIZ(block, "block");
            C61593OFh c61593OFh = new C61593OFh();
            block.invoke(c61593OFh);
            this.interactionAction = c61593OFh;
            this.interactionType = InteractionType.BUTTON;
            return this;
        }

        public final Builder setInteractionWithCustomView(View view) {
            o.LJIIIZ(view, "view");
            this.interactionLayoutView = view;
            this.interactionType = InteractionType.CUSTOM;
            return this;
        }

        public final Builder setTitleMaxLine(int i) {
            if (this.whiteList.contains(this.bannerName)) {
                if (i <= 2) {
                    this.titleMaxLine = i;
                    return this;
                }
                "currently support maxLines is <=2".toString();
                throw new IllegalStateException("currently support maxLines is <=2");
            }
            "\n                   current assem does support set title maxLines, \n                   you should contact @sunkejian.1168 or @yangqifan.harry to \n                   add this component to whitelist \n                ".toString();
            throw new IllegalStateException("\n                   current assem does support set title maxLines, \n                   you should contact @sunkejian.1168 or @yangqifan.harry to \n                   add this component to whitelist \n                ");
        }

        public final Builder setUpdateTitleSync(boolean z) {
            this.titleSyncSet = z;
            return this;
        }

        public Builder(String bannerName, Set<String> whiteList) {
            o.LJIIIZ(bannerName, "bannerName");
            o.LJIIIZ(whiteList, "whiteList");
            this.bannerName = bannerName;
            this.whiteList = whiteList;
            this.iconType = IconType.LOCAL;
            this.titleMaxLine = 1;
            this.interactionType = InteractionType.ARROW;
        }

        public final Builder setInteractionWithCustomViewAsync(int i, Callback callback) {
            o.LJIIIZ(callback, "callback");
            this.interactionLayoutId = Integer.valueOf(i);
            this.interactionLayoutCallback = callback;
            this.interactionType = InteractionType.CUSTOM;
            return this;
        }

        public final Builder setTitleEndIcon(C2068389v icon, InterfaceC88472Yns<? super View, C76800UCe> interfaceC88472Yns) {
            o.LJIIIZ(icon, "icon");
            this.titleEndIcon = icon;
            this.titleEndIconView = interfaceC88472Yns;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Builder setInteractionWithArrow$default(Builder builder, InterfaceC88472Yns interfaceC88472Yns, int i, Object obj) {
            if ((i & 1) != 0) {
                interfaceC88472Yns = FeedBottomBannerConfig$Builder$setInteractionWithArrow$1.INSTANCE;
            }
            builder.setInteractionWithArrow(interfaceC88472Yns);
            return builder;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Builder setInteractionWithButton$default(Builder builder, InterfaceC88472Yns interfaceC88472Yns, int i, Object obj) {
            if ((i & 1) != 0) {
                interfaceC88472Yns = FeedBottomBannerConfig$Builder$setInteractionWithButton$1.INSTANCE;
            }
            builder.setInteractionWithButton(interfaceC88472Yns);
            return builder;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Builder setTitleEndIcon$default(Builder builder, C2068389v c2068389v, InterfaceC88472Yns interfaceC88472Yns, int i, Object obj) {
            if ((i & 2) != 0) {
                interfaceC88472Yns = null;
            }
            builder.setTitleEndIcon(c2068389v, interfaceC88472Yns);
            return builder;
        }
    }

    /* loaded from: classes11.dex */
    public interface Callback {
        void onFinishedInflate(View view);
    }

    /* loaded from: classes11.dex */
    public enum IconType {
        LOCAL,
        REMOTE;

        public static IconType valueOf(String str) {
            return (IconType) V0N.LJJJ(IconType.class, str);
        }
    }

    /* loaded from: classes11.dex */
    public enum InteractionType {
        ARROW,
        BUTTON,
        CUSTOM;

        public static InteractionType valueOf(String str) {
            return (InteractionType) V0N.LJJJ(InteractionType.class, str);
        }
    }

    public /* synthetic */ FeedBottomBannerConfig(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Integer num = this.iconRes;
        int i8 = 0;
        if (num != null) {
            i = num.hashCode();
        } else {
            i = 0;
        }
        int i9 = i * 31;
        InterfaceC88472Yns<W5F, C76800UCe> interfaceC88472Yns = this.iconLighten;
        if (interfaceC88472Yns != null) {
            i2 = interfaceC88472Yns.hashCode();
        } else {
            i2 = 0;
        }
        int LIZ = C07250Qf.LIZ(this.titleSyncSet, (this.iconType.hashCode() + ((i9 + i2) * 31)) * 31, 31);
        C2068389v c2068389v = this.titleEndIcon;
        if (c2068389v != null) {
            i3 = c2068389v.hashCode();
        } else {
            i3 = 0;
        }
        int i10 = (LIZ + i3) * 31;
        InterfaceC88472Yns<View, C76800UCe> interfaceC88472Yns2 = this.titleEndIconView;
        if (interfaceC88472Yns2 != null) {
            i4 = interfaceC88472Yns2.hashCode();
        } else {
            i4 = 0;
        }
        int hashCode = (this.interactionType.hashCode() + ((((i10 + i4) * 31) + this.titleMaxLine) * 31)) * 31;
        OM7 om7 = this.interactionAction;
        if (om7 != null) {
            i5 = om7.hashCode();
        } else {
            i5 = 0;
        }
        int i11 = (hashCode + i5) * 31;
        View view = this.interactionLayoutView;
        if (view != null) {
            i6 = view.hashCode();
        } else {
            i6 = 0;
        }
        int i12 = (i11 + i6) * 31;
        Integer num2 = this.interactionLayoutId;
        if (num2 != null) {
            i7 = num2.hashCode();
        } else {
            i7 = 0;
        }
        int i13 = (i12 + i7) * 31;
        Callback callback = this.interactionLayoutCallback;
        if (callback != null) {
            i8 = callback.hashCode();
        }
        return i13 + i8;
    }

    public final Builder toBuilder() {
        Builder builder = new Builder(this.bannerName, this.whiteList);
        builder.iconRes = this.iconRes;
        builder.lightenImageRequestBuilder = this.iconLighten;
        builder.setIconType$common_feed_api_release(this.iconType);
        builder.titleSyncSet = this.titleSyncSet;
        builder.titleMaxLine = this.titleMaxLine;
        builder.titleEndIcon = this.titleEndIcon;
        builder.titleEndIconView = this.titleEndIconView;
        builder.setInteractionType$common_feed_api_release(this.interactionType);
        builder.interactionAction = this.interactionAction;
        builder.interactionLayoutView = this.interactionLayoutView;
        builder.interactionLayoutId = this.interactionLayoutId;
        builder.interactionLayoutCallback = this.interactionLayoutCallback;
        return builder;
    }

    public FeedBottomBannerConfig(Builder builder) {
        this(builder.bannerName, builder.whiteList, builder.iconType, builder.iconRes, builder.lightenImageRequestBuilder, builder.titleSyncSet, builder.titleMaxLine, builder.titleEndIcon, builder.titleEndIconView, builder.interactionType, builder.interactionAction, builder.interactionLayoutView, builder.interactionLayoutId, builder.interactionLayoutCallback);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof FeedBottomBannerConfig)) {
            return false;
        }
        FeedBottomBannerConfig feedBottomBannerConfig = (FeedBottomBannerConfig) obj;
        if (o.LJ(this.iconRes, feedBottomBannerConfig.iconRes) && o.LJ(this.iconLighten, feedBottomBannerConfig.iconLighten) && this.iconType == feedBottomBannerConfig.iconType && this.titleSyncSet == feedBottomBannerConfig.titleSyncSet && o.LJ(this.titleEndIcon, feedBottomBannerConfig.titleEndIcon) && o.LJ(this.titleEndIconView, feedBottomBannerConfig.titleEndIconView) && this.titleMaxLine == feedBottomBannerConfig.titleMaxLine && this.interactionType == feedBottomBannerConfig.interactionType && o.LJ(this.interactionAction, feedBottomBannerConfig.interactionAction) && o.LJ(this.interactionLayoutView, feedBottomBannerConfig.interactionLayoutView) && o.LJ(this.interactionLayoutId, feedBottomBannerConfig.interactionLayoutId) && o.LJ(this.interactionLayoutCallback, feedBottomBannerConfig.interactionLayoutCallback)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FeedBottomBannerConfig(String str, Set<String> set, IconType iconType, Integer num, InterfaceC88472Yns<? super W5F, C76800UCe> interfaceC88472Yns, boolean z, int i, C2068389v c2068389v, InterfaceC88472Yns<? super View, C76800UCe> interfaceC88472Yns2, InteractionType interactionType, OM7 om7, View view, Integer num2, Callback callback) {
        this.bannerName = str;
        this.whiteList = set;
        this.iconType = iconType;
        this.iconRes = num;
        this.iconLighten = interfaceC88472Yns;
        this.titleSyncSet = z;
        this.titleMaxLine = i;
        this.titleEndIcon = c2068389v;
        this.titleEndIconView = interfaceC88472Yns2;
        this.interactionType = interactionType;
        this.interactionAction = om7;
        this.interactionLayoutView = view;
        this.interactionLayoutId = num2;
        this.interactionLayoutCallback = callback;
    }

    public /* synthetic */ FeedBottomBannerConfig(String str, Set set, IconType iconType, Integer num, InterfaceC88472Yns interfaceC88472Yns, boolean z, int i, C2068389v c2068389v, InterfaceC88472Yns interfaceC88472Yns2, InteractionType interactionType, OM7 om7, View view, Integer num2, Callback callback, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, set, (i2 & 4) != 0 ? IconType.LOCAL : iconType, num, (i2 & 16) != 0 ? null : interfaceC88472Yns, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? 1 : i, (i2 & 128) != 0 ? null : c2068389v, (i2 & 256) != 0 ? null : interfaceC88472Yns2, (i2 & 512) != 0 ? InteractionType.ARROW : interactionType, (i2 & 1024) != 0 ? null : om7, (i2 & 2048) != 0 ? null : view, (i2 & 4096) != 0 ? null : num2, (i2 & FileUtils.BUFFER_SIZE) == 0 ? callback : null);
    }
}
