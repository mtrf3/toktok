package com.ss.android.ugc.aweme.feed.model.bottom.banner;

import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public interface FeedBottomBannerUIProps {

    /* loaded from: classes10.dex */
    public static final class Icon implements FeedBottomBannerUIProps {
        public final String url;

        /* JADX WARN: Multi-variable type inference failed */
        public Icon() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Icon copy$default(Icon icon, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = icon.url;
            }
            return icon.copy(str);
        }

        public final Icon copy(String str) {
            return new Icon(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Icon) && o.LJ(this.url, ((Icon) obj).url);
        }

        public int hashCode() {
            String str = this.url;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Icon(url=");
            return q.LIZIZ(LIZ, this.url, ')', LIZ);
        }

        public Icon(String str) {
            this.url = str;
        }

        public /* synthetic */ Icon(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }
    }

    /* loaded from: classes10.dex */
    public static final class Title implements FeedBottomBannerUIProps {
        public final CharSequence content;

        public static /* synthetic */ Title copy$default(Title title, CharSequence charSequence, int i, Object obj) {
            if ((i & 1) != 0) {
                charSequence = title.content;
            }
            return title.copy(charSequence);
        }

        public final Title copy(CharSequence content) {
            o.LJIIIZ(content, "content");
            return new Title(content);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Title) && o.LJ(this.content, ((Title) obj).content);
        }

        public int hashCode() {
            return this.content.hashCode();
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Title(content=");
            LIZ.append((Object) this.content);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        public Title(CharSequence content) {
            o.LJIIIZ(content, "content");
            this.content = content;
        }
    }
}
