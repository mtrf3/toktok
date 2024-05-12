package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C05040Hs;
import X.C1FJ;
import X.C1FL;
import X.C27065Ajl;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class Announcement implements Parcelable {
    public static final Parcelable.Creator<Announcement> CREATOR = new C27065Ajl();

    @InterfaceC65349Pkn("announcement_id")
    public final String announcementId;

    @InterfaceC65349Pkn("announcement_show_type")
    public final Integer announcementShowType;

    @InterfaceC65349Pkn("arguments")
    public final Map<String, String> arguments;

    @InterfaceC65349Pkn("background")
    public final Image background;

    @InterfaceC65349Pkn("bold_text")
    public final String boldText;

    @InterfaceC65349Pkn("button_text")
    public final String buttonText;

    @InterfaceC65349Pkn("clickable")
    public final Boolean clickable;

    @InterfaceC65349Pkn("da_info")
    public final String daInfo;

    @InterfaceC65349Pkn("icon")
    public final Image icon;

    @InterfaceC65349Pkn("icon_text")
    public final String iconText;

    @InterfaceC65349Pkn("link")
    public final String link;

    @InterfaceC65349Pkn("link_arguments")
    public final Map<String, LinkText> linkArguments;

    @InterfaceC65349Pkn("material_type")
    public final Integer materialType;

    @InterfaceC65349Pkn("max_text_line")
    public final Long maxTextLine;

    @InterfaceC65349Pkn("text")
    public final String text;

    @InterfaceC65349Pkn("usable_end_time")
    public final Long usableEndTime;

    public static /* synthetic */ Announcement copy$default(Announcement announcement, String str, String str2, Image image, String str3, Image image2, Integer num, Integer num2, Boolean bool, String str4, String str5, String str6, String str7, Long l, Map map, Map map2, Long l2, int i, Object obj) {
        String str8 = str;
        String str9 = str2;
        Image image3 = image2;
        Image image4 = image;
        String str10 = str3;
        Boolean bool2 = bool;
        Integer num3 = num;
        Integer num4 = num2;
        String str11 = str6;
        String str12 = str4;
        String str13 = str5;
        Map map3 = map;
        String str14 = str7;
        Long l3 = l;
        Long l4 = l2;
        Map map4 = map2;
        if ((i & 1) != 0) {
            str8 = announcement.announcementId;
        }
        if ((i & 2) != 0) {
            str9 = announcement.text;
        }
        if ((i & 4) != 0) {
            image4 = announcement.icon;
        }
        if ((i & 8) != 0) {
            str10 = announcement.link;
        }
        if ((i & 16) != 0) {
            image3 = announcement.background;
        }
        if ((i & 32) != 0) {
            num3 = announcement.materialType;
        }
        if ((i & 64) != 0) {
            num4 = announcement.announcementShowType;
        }
        if ((i & 128) != 0) {
            bool2 = announcement.clickable;
        }
        if ((i & 256) != 0) {
            str12 = announcement.daInfo;
        }
        if ((i & 512) != 0) {
            str13 = announcement.iconText;
        }
        if ((i & 1024) != 0) {
            str11 = announcement.boldText;
        }
        if ((i & 2048) != 0) {
            str14 = announcement.buttonText;
        }
        if ((i & 4096) != 0) {
            l3 = announcement.usableEndTime;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            map3 = announcement.arguments;
        }
        if ((i & 16384) != 0) {
            map4 = announcement.linkArguments;
        }
        if ((i & 32768) != 0) {
            l4 = announcement.maxTextLine;
        }
        String str15 = str10;
        return announcement.copy(str8, str9, image4, str15, image3, num3, num4, bool2, str12, str13, str11, str14, l3, map3, map4, l4);
    }

    public final Announcement copy(String str, String str2, Image image, String str3, Image image2, Integer num, Integer num2, Boolean bool, String str4, String str5, String str6, String str7, Long l, Map<String, String> map, Map<String, LinkText> map2, Long l2) {
        return new Announcement(str, str2, image, str3, image2, num, num2, bool, str4, str5, str6, str7, l, map, map2, l2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Announcement)) {
            return false;
        }
        Announcement announcement = (Announcement) obj;
        return o.LJ(this.announcementId, announcement.announcementId) && o.LJ(this.text, announcement.text) && o.LJ(this.icon, announcement.icon) && o.LJ(this.link, announcement.link) && o.LJ(this.background, announcement.background) && o.LJ(this.materialType, announcement.materialType) && o.LJ(this.announcementShowType, announcement.announcementShowType) && o.LJ(this.clickable, announcement.clickable) && o.LJ(this.daInfo, announcement.daInfo) && o.LJ(this.iconText, announcement.iconText) && o.LJ(this.boldText, announcement.boldText) && o.LJ(this.buttonText, announcement.buttonText) && o.LJ(this.usableEndTime, announcement.usableEndTime) && o.LJ(this.arguments, announcement.arguments) && o.LJ(this.linkArguments, announcement.linkArguments) && o.LJ(this.maxTextLine, announcement.maxTextLine);
    }

    public int hashCode() {
        String str = this.announcementId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.text;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Image image = this.icon;
        int hashCode3 = (hashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        String str3 = this.link;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Image image2 = this.background;
        int hashCode5 = (hashCode4 + (image2 == null ? 0 : image2.hashCode())) * 31;
        Integer num = this.materialType;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.announcementShowType;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.clickable;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.daInfo;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.iconText;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.boldText;
        int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.buttonText;
        int hashCode12 = (hashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l = this.usableEndTime;
        int hashCode13 = (hashCode12 + (l == null ? 0 : l.hashCode())) * 31;
        Map<String, String> map = this.arguments;
        int hashCode14 = (hashCode13 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, LinkText> map2 = this.linkArguments;
        int hashCode15 = (hashCode14 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Long l2 = this.maxTextLine;
        return hashCode15 + (l2 != null ? l2.hashCode() : 0);
    }

    public String toString() {
        return "Announcement(announcementId=" + this.announcementId + ", text=" + this.text + ", icon=" + this.icon + ", link=" + this.link + ", background=" + this.background + ", materialType=" + this.materialType + ", announcementShowType=" + this.announcementShowType + ", clickable=" + this.clickable + ", daInfo=" + this.daInfo + ", iconText=" + this.iconText + ", boldText=" + this.boldText + ", buttonText=" + this.buttonText + ", usableEndTime=" + this.usableEndTime + ", arguments=" + this.arguments + ", linkArguments=" + this.linkArguments + ", maxTextLine=" + this.maxTextLine + ')';
    }

    public final String getAnnouncementId() {
        return this.announcementId;
    }

    public final Integer getAnnouncementShowType() {
        return this.announcementShowType;
    }

    public final Map<String, String> getArguments() {
        return this.arguments;
    }

    public final Image getBackground() {
        return this.background;
    }

    public final String getBoldText() {
        return this.boldText;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final Boolean getClickable() {
        return this.clickable;
    }

    public final String getDaInfo() {
        return this.daInfo;
    }

    public final Image getIcon() {
        return this.icon;
    }

    public final String getIconText() {
        return this.iconText;
    }

    public final String getLink() {
        return this.link;
    }

    public final Map<String, LinkText> getLinkArguments() {
        return this.linkArguments;
    }

    public final Integer getMaterialType() {
        return this.materialType;
    }

    public final Long getMaxTextLine() {
        return this.maxTextLine;
    }

    public final String getText() {
        return this.text;
    }

    public final Long getUsableEndTime() {
        return this.usableEndTime;
    }

    public final Announcement merge(Announcement announcement) {
        if (announcement == null) {
            return this;
        }
        String str = announcement.announcementId;
        if (str == null) {
            str = this.announcementId;
        }
        String str2 = announcement.text;
        if (str2 == null) {
            str2 = this.text;
        }
        Image image = announcement.icon;
        if (image == null) {
            image = this.icon;
        }
        String str3 = announcement.link;
        if (str3 == null) {
            str3 = this.link;
        }
        Image image2 = announcement.background;
        if (image2 == null) {
            image2 = this.background;
        }
        Integer num = announcement.materialType;
        if (num == null) {
            num = this.materialType;
        }
        Integer num2 = announcement.announcementShowType;
        if (num2 == null) {
            num2 = this.announcementShowType;
        }
        Boolean bool = announcement.clickable;
        if (bool == null) {
            bool = this.clickable;
        }
        String str4 = announcement.daInfo;
        if (str4 == null) {
            str4 = this.daInfo;
        }
        String str5 = announcement.iconText;
        if (str5 == null) {
            str5 = this.iconText;
        }
        String str6 = announcement.boldText;
        if (str6 == null) {
            str6 = this.boldText;
        }
        String str7 = announcement.buttonText;
        if (str7 == null) {
            str7 = this.buttonText;
        }
        Long l = announcement.usableEndTime;
        if (l == null) {
            l = this.usableEndTime;
        }
        Map<String, String> map = announcement.arguments;
        if (map == null) {
            map = this.arguments;
        }
        Map<String, LinkText> map2 = announcement.linkArguments;
        if (map2 == null) {
            map2 = this.linkArguments;
        }
        Long l2 = announcement.maxTextLine;
        if (l2 == null) {
            l2 = this.maxTextLine;
        }
        return new Announcement(str, str2, image, str3, image2, num, num2, bool, str4, str5, str6, str7, l, map, map2, l2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.announcementId);
        out.writeString(this.text);
        out.writeParcelable(this.icon, i);
        out.writeString(this.link);
        out.writeParcelable(this.background, i);
        Integer num = this.materialType;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        Integer num2 = this.announcementShowType;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num2);
        }
        Boolean bool = this.clickable;
        if (bool == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool);
        }
        out.writeString(this.daInfo);
        out.writeString(this.iconText);
        out.writeString(this.boldText);
        out.writeString(this.buttonText);
        Long l = this.usableEndTime;
        if (l == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l);
        }
        Map<String, String> map = this.arguments;
        if (map == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                out.writeString(entry.getKey());
                out.writeString(entry.getValue());
            }
        }
        Map<String, LinkText> map2 = this.linkArguments;
        if (map2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(map2.size());
            for (Map.Entry<String, LinkText> entry2 : map2.entrySet()) {
                out.writeString(entry2.getKey());
                entry2.getValue().writeToParcel(out, i);
            }
        }
        Long l2 = this.maxTextLine;
        if (l2 == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l2);
        }
    }

    public Announcement(String str, String str2, Image image, String str3, Image image2, Integer num, Integer num2, Boolean bool, String str4, String str5, String str6, String str7, Long l, Map<String, String> map, Map<String, LinkText> map2, Long l2) {
        this.announcementId = str;
        this.text = str2;
        this.icon = image;
        this.link = str3;
        this.background = image2;
        this.materialType = num;
        this.announcementShowType = num2;
        this.clickable = bool;
        this.daInfo = str4;
        this.iconText = str5;
        this.boldText = str6;
        this.buttonText = str7;
        this.usableEndTime = l;
        this.arguments = map;
        this.linkArguments = map2;
        this.maxTextLine = l2;
    }
}
