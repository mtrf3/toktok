package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.C16880lQ;
import X.C34B;
import X.InterfaceC65349Pkn;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class SystemContent extends BaseContent {
    public static final LinkTypeExtra LinkTypeExtra = new LinkTypeExtra();

    @InterfaceC65349Pkn("fallback_tips")
    public String fallbackTips;

    @InterfaceC65349Pkn("group_tips")
    public String groupNoticeTips;

    @InterfaceC65349Pkn("android_filter_max_version")
    public String maxVersion;

    @InterfaceC65349Pkn("android_filter_min_version")
    public String minVersion;

    @InterfaceC65349Pkn("new_template")
    public Key[] newTemplate;

    @InterfaceC65349Pkn("new_tips")
    public String newTips;

    @InterfaceC65349Pkn("strong_template")
    public Key[] strongTemplate;

    @InterfaceC65349Pkn("strong_tips")
    public String strongTips;

    @InterfaceC65349Pkn("template")
    public Key[] template;

    @InterfaceC65349Pkn("tips")
    public String tips;

    public final long getMaxVersion() {
        return safelyReturnLong(this.maxVersion);
    }

    public final long getMinVersion() {
        return safelyReturnLong(this.minVersion);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String getMsgHint() {
        String str = this.tips;
        if (str == null) {
            str = "";
        }
        if (str.length() == 0) {
            return "";
        }
        Key[] keyArr = this.template;
        if (keyArr != null) {
            for (Key key : keyArr) {
                String name = key.getName();
                if (name != null) {
                    String LLLZ = C16880lQ.LLLZ("{{%s}}", Arrays.copyOf(new Object[]{key.getKey()}, 1));
                    o.LJIIIIZZ(LLLZ, "format(format, *args)");
                    str = ujb.o.LJJJJZ(str, LLLZ, name, false);
                }
            }
        }
        return str;
    }

    /* loaded from: classes2.dex */
    public static final class Key implements Serializable {

        @InterfaceC65349Pkn("action")
        public int action;

        @InterfaceC65349Pkn("extra")
        public Map<String, String> extra;

        @InterfaceC65349Pkn("key")
        public String key;

        @InterfaceC65349Pkn("link")
        public String link;

        @InterfaceC65349Pkn("name")
        public String name;

        public static /* synthetic */ void getAction$annotations() {
        }

        public final int getAction() {
            return this.action;
        }

        public final Map<String, String> getExtra() {
            return this.extra;
        }

        public final String getKey() {
            return this.key;
        }

        public final String getLink() {
            return this.link;
        }

        public final String getName() {
            return this.name;
        }

        public final void setAction(int i) {
            this.action = i;
        }

        public final void setExtra(Map<String, String> map) {
            this.extra = map;
        }

        public final void setKey(String str) {
            this.key = str;
        }

        public final void setLink(String str) {
            this.link = str;
        }

        public final void setName(String str) {
            this.name = str;
        }
    }

    /* loaded from: classes2.dex */
    public static final class LinkTypeExtra {
        public /* synthetic */ LinkTypeExtra(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public LinkTypeExtra() {
        }

        public final boolean isSafeWarningLink(Key key) {
            boolean z = false;
            if (key == null) {
                return false;
            }
            try {
                Map<String, String> extra = key.getExtra();
                if (extra == null) {
                    return false;
                }
                z = TextUtils.equals(extra.get("link_type"), "safe_warning");
                return z;
            } catch (Exception e) {
                C34B.LJFF(e);
                return z;
            }
        }
    }

    public final String getFallbackTips() {
        return this.fallbackTips;
    }

    public final String getGroupNoticeTips() {
        return this.groupNoticeTips;
    }

    public final Key[] getNewTemplate() {
        return this.newTemplate;
    }

    public final String getNewTips() {
        return this.newTips;
    }

    public final Key[] getStrongTemplate() {
        return this.strongTemplate;
    }

    public final String getStrongTips() {
        return this.strongTips;
    }

    public final Key[] getTemplate() {
        return this.template;
    }

    public final String getTips() {
        return this.tips;
    }

    /* renamed from: getMaxVersion, reason: collision with other method in class */
    public final String m134getMaxVersion() {
        return this.maxVersion;
    }

    /* renamed from: getMinVersion, reason: collision with other method in class */
    public final String m135getMinVersion() {
        return this.minVersion;
    }

    private final long safelyReturnLong(String str) {
        long j = 0;
        if (str == null) {
            return 0L;
        }
        try {
            j = CastLongProtector.parseLong(str);
            return j;
        } catch (NumberFormatException e) {
            C34B.LJFF(e);
            return j;
        }
    }

    public final void setFallbackTips(String str) {
        this.fallbackTips = str;
    }

    public final void setGroupNoticeTips(String str) {
        this.groupNoticeTips = str;
    }

    public final void setMaxVersion(String str) {
        this.maxVersion = str;
    }

    public final void setMinVersion(String str) {
        this.minVersion = str;
    }

    public final void setNewTemplate(Key[] keyArr) {
        this.newTemplate = keyArr;
    }

    public final void setNewTips(String str) {
        this.newTips = str;
    }

    public final void setStrongTemplate(Key[] keyArr) {
        this.strongTemplate = keyArr;
    }

    public final void setStrongTips(String str) {
        this.strongTips = str;
    }

    public final void setTemplate(Key[] keyArr) {
        this.template = keyArr;
    }

    public final void setTips(String str) {
        this.tips = str;
    }
}
