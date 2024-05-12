package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C15890jp;
import X.C1FJ;
import X.C27236AmW;
import X.C27237AmX;
import X.C279017q;
import X.InterfaceC65349Pkn;
import X.ORS;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkText;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class InputItemDTO implements Parcelable {
    public static final Parcelable.Creator<InputItemDTO> CREATOR = new C27236AmW();

    @InterfaceC65349Pkn("arguments")
    public final Map<String, LinkText> arguments;

    @InterfaceC65349Pkn("default_value")
    public final String defaultValue;

    @InterfaceC65349Pkn("hint")
    public final String hint;

    @InterfaceC65349Pkn("input_hint_message")
    public final String inputHintMessage;

    @InterfaceC65349Pkn("key")
    public final String key;

    @InterfaceC65349Pkn("max_length")
    public final Integer maxLength;

    @InterfaceC65349Pkn("max_line")
    public final Integer maxLines;

    @InterfaceC65349Pkn("rules")
    public final List<Rule> rules;

    @InterfaceC65349Pkn("title")
    public final String title;

    @InterfaceC65349Pkn("type")
    public final Integer type;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputItemDTO)) {
            return false;
        }
        InputItemDTO inputItemDTO = (InputItemDTO) obj;
        return o.LJ(this.defaultValue, inputItemDTO.defaultValue) && o.LJ(this.hint, inputItemDTO.hint) && o.LJ(this.key, inputItemDTO.key) && o.LJ(this.maxLength, inputItemDTO.maxLength) && o.LJ(this.maxLines, inputItemDTO.maxLines) && o.LJ(this.title, inputItemDTO.title) && o.LJ(this.type, inputItemDTO.type) && o.LJ(this.rules, inputItemDTO.rules) && o.LJ(this.inputHintMessage, inputItemDTO.inputHintMessage) && o.LJ(this.arguments, inputItemDTO.arguments);
    }

    public final int hashCode() {
        String str = this.defaultValue;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.hint;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.key;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.maxLength;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maxLines;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.title;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num3 = this.type;
        int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<Rule> list = this.rules;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.inputHintMessage;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Map<String, LinkText> map = this.arguments;
        return hashCode9 + (map != null ? map.hashCode() : 0);
    }

    public final void LIZIZ() {
        List<Rule> list = this.rules;
        if (list != null) {
            ORS.LJJLIL(C27237AmX.LJLIL, list);
        }
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InputItemDTO(defaultValue=");
        LIZ.append(this.defaultValue);
        LIZ.append(", hint=");
        LIZ.append(this.hint);
        LIZ.append(", key=");
        LIZ.append(this.key);
        LIZ.append(", maxLength=");
        LIZ.append(this.maxLength);
        LIZ.append(", maxLines=");
        LIZ.append(this.maxLines);
        LIZ.append(", title=");
        LIZ.append(this.title);
        LIZ.append(", type=");
        LIZ.append(this.type);
        LIZ.append(", rules=");
        LIZ.append(this.rules);
        LIZ.append(", inputHintMessage=");
        LIZ.append(this.inputHintMessage);
        LIZ.append(", arguments=");
        return C15890jp.LIZ(LIZ, this.arguments, ')', LIZ);
    }

    public static InputItemDTO LIZ(InputItemDTO inputItemDTO, Integer num) {
        String str = inputItemDTO.defaultValue;
        String str2 = inputItemDTO.hint;
        String str3 = inputItemDTO.key;
        Integer num2 = inputItemDTO.maxLength;
        Integer num3 = inputItemDTO.maxLines;
        String str4 = inputItemDTO.title;
        List<Rule> list = inputItemDTO.rules;
        String str5 = inputItemDTO.inputHintMessage;
        Map<String, LinkText> map = inputItemDTO.arguments;
        inputItemDTO.getClass();
        return new InputItemDTO(str, str2, str3, num2, num3, str4, num, list, str5, map);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.defaultValue);
        out.writeString(this.hint);
        out.writeString(this.key);
        Integer num = this.maxLength;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        Integer num2 = this.maxLines;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num2);
        }
        out.writeString(this.title);
        Integer num3 = this.type;
        if (num3 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num3);
        }
        List<Rule> list = this.rules;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((Rule) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        out.writeString(this.inputHintMessage);
        Map<String, LinkText> map = this.arguments;
        if (map == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(map.size());
        for (Map.Entry<String, LinkText> entry : map.entrySet()) {
            out.writeString(entry.getKey());
            LinkText value = entry.getValue();
            if (value == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                value.writeToParcel(out, i);
            }
        }
    }

    public InputItemDTO(String str, String str2, String str3, Integer num, Integer num2, String str4, Integer num3, List<Rule> list, String str5, Map<String, LinkText> map) {
        this.defaultValue = str;
        this.hint = str2;
        this.key = str3;
        this.maxLength = num;
        this.maxLines = num2;
        this.title = str4;
        this.type = num3;
        this.rules = list;
        this.inputHintMessage = str5;
        this.arguments = map;
    }

    public /* synthetic */ InputItemDTO(String str, String str2, String str3, Integer num, Integer num2, String str4, Integer num3, List list, String str5, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, num, num2, str4, num3, list, str5, (i & 512) != 0 ? null : map);
    }
}
