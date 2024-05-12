package com.ss.android.ugc.aweme.editSticker.text.bean;

import X.C65424Pm0;
import X.C65425Pm1;
import X.InterfaceC65349Pkn;
import X.InterfaceC65404Plg;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.style.CharacterStyle;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.j;
import com.google.gson.q;
import com.google.gson.r;
import java.lang.reflect.Type;
import kotlin.jvm.internal.o;

@InterfaceC65404Plg(InlineRichStyleTypeAdapter.class)
/* loaded from: classes12.dex */
public class InlineRichTextStyle implements Parcelable {

    @InterfaceC65349Pkn("type")
    public final String type;
    public static final C65425Pm1 Companion = new C65425Pm1();
    public static final Parcelable.Creator<InlineRichTextStyle> CREATOR = new C65424Pm0();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.type);
    }

    public CharacterStyle LIZ() {
        throw new UnsupportedOperationException();
    }

    public InlineRichTextStyle(String type) {
        o.LJIIIZ(type, "type");
        this.type = type;
    }

    /* loaded from: classes12.dex */
    public static final class InlineRichStyleTypeAdapter implements i<InlineRichTextStyle>, r<InlineRichTextStyle> {
        /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, com.ss.android.ugc.aweme.editSticker.text.bean.InlineRichTextStyle] */
        /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, com.ss.android.ugc.aweme.editSticker.text.bean.InlineRichTextStyle] */
        @Override // com.google.gson.i
        public final InlineRichTextStyle deserialize(j jVar, Type type, h hVar) {
            String LJJIFFI = jVar.LJIIZILJ().LJJIJ("type").LJJIFFI();
            if (o.LJ(LJJIFFI, "ForegroundColorStyle")) {
                if (hVar != null) {
                    return ((TreeTypeAdapter.a) hVar).LIZ(jVar, ForegroundColorStyle.class);
                }
            } else if (o.LJ(LJJIFFI, "TypefaceStyle") && hVar != null) {
                return ((TreeTypeAdapter.a) hVar).LIZ(jVar, TypefaceStyle.class);
            }
            return null;
        }

        @Override // com.google.gson.r
        public final j serialize(InlineRichTextStyle inlineRichTextStyle, Type type, q qVar) {
            if (inlineRichTextStyle != null && qVar != null) {
                if (inlineRichTextStyle instanceof ForegroundColorStyle) {
                    return TreeTypeAdapter.this.LIZJ.LJIL(inlineRichTextStyle, ForegroundColorStyle.class);
                }
                if (inlineRichTextStyle instanceof TypefaceStyle) {
                    return TreeTypeAdapter.this.LIZJ.LJIL(inlineRichTextStyle, TypefaceStyle.class);
                }
            }
            return null;
        }
    }
}
