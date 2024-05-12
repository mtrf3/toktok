package com.ss.android.ugc.gamora.editor.text;

import X.C1NE;
import X.C221108m2;
import X.C47261Igj;
import X.C62822Ol8;
import X.InterfaceC65349Pkn;
import X.OI3;
import X.X1D;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class TextModeBackgroundSettings {
    public static final TextModeBackgroundConfig LIZ;
    public static final C62822Ol8 LIZIZ;

    /* loaded from: classes11.dex */
    public static final class BackgroundItem {

        @InterfaceC65349Pkn("background")
        public final String backgroundFileName;

        @InterfaceC65349Pkn("button")
        public final String buttonIconName;

        @InterfaceC65349Pkn("textColor")
        public final String textColor;

        /* JADX WARN: Multi-variable type inference failed */
        public BackgroundItem() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BackgroundItem)) {
                return false;
            }
            BackgroundItem backgroundItem = (BackgroundItem) obj;
            return o.LJ(this.backgroundFileName, backgroundItem.backgroundFileName) && o.LJ(this.textColor, backgroundItem.textColor) && o.LJ(this.buttonIconName, backgroundItem.buttonIconName);
        }

        public final int hashCode() {
            String str = this.backgroundFileName;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.textColor;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.buttonIconName;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("BackgroundItem(backgroundFileName=");
            LIZ.append(this.backgroundFileName);
            LIZ.append(", textColor=");
            LIZ.append(this.textColor);
            LIZ.append(", buttonIconName=");
            return q.LIZIZ(LIZ, this.buttonIconName, ')', LIZ);
        }

        public BackgroundItem(String str, String str2, String str3) {
            this.backgroundFileName = str;
            this.textColor = str2;
            this.buttonIconName = str3;
        }

        public /* synthetic */ BackgroundItem(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }
    }

    /* loaded from: classes11.dex */
    public static final class TextModeBackgroundConfig {

        @InterfaceC65349Pkn("channelName")
        public final String channelName;

        @InterfaceC65349Pkn("config")
        public final List<BackgroundItem> items;

        /* JADX WARN: Multi-variable type inference failed */
        public TextModeBackgroundConfig() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TextModeBackgroundConfig)) {
                return false;
            }
            TextModeBackgroundConfig textModeBackgroundConfig = (TextModeBackgroundConfig) obj;
            return o.LJ(this.channelName, textModeBackgroundConfig.channelName) && o.LJ(this.items, textModeBackgroundConfig.items);
        }

        public final int hashCode() {
            String str = this.channelName;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            List<BackgroundItem> list = this.items;
            return hashCode + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("TextModeBackgroundConfig(channelName=");
            LIZ.append(this.channelName);
            LIZ.append(", items=");
            return C1NE.LIZIZ(LIZ, this.items, ')', LIZ);
        }

        public TextModeBackgroundConfig(String str, List<BackgroundItem> list) {
            this.channelName = str;
            this.items = list;
        }

        public /* synthetic */ TextModeBackgroundConfig(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "textmode_bg_resource" : str, (i & 2) != 0 ? C47261Igj.LJJIJIIJI(new BackgroundItem("bg_00.png", "#FFFFFFFF", "buttonImage00.png"), new BackgroundItem("bg_01.png", "#FFFFFFFF", "buttonImage01.png"), new BackgroundItem("bg_02.png", "#FFFFFFFF", "buttonImage02.png"), new BackgroundItem("bg_03.png", "#FFFFFFFF", "buttonImage03.png"), new BackgroundItem("bg_04.png", "#FFFFFFFF", "buttonImage04.png"), new BackgroundItem("bg_05.png", "#FFFFFFFF", "buttonImage05.png")) : list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        new TextModeBackgroundSettings();
        LIZ = new TextModeBackgroundConfig(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        LIZIZ = C221108m2.LIZIZ(OI3.LJLIL);
    }
}
