package com.ss.android.ugc.aweme.editSticker.text.bean;

import X.C32I;
import X.F9E;
import X.H7B;
import X.OSZ;
import X.UC7;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.text.bean.InteractTextStructWrap;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerString;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextPair;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes3.dex */
public final class TextStickerTextWrap extends F9E implements Parcelable, Cloneable {
    public static final Parcelable.Creator<TextStickerTextWrap> CREATOR = new Parcelable.Creator<TextStickerTextWrap>() { // from class: X.68X
        @Override // android.os.Parcelable.Creator
        public final TextStickerTextWrap createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            o.LJIIIZ(parcel, "parcel");
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i = 0; i != readInt; i++) {
                TextStickerString createFromParcel = TextStickerString.CREATOR.createFromParcel(parcel);
                int readInt2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = C279117r.LIZIZ(InteractTextStructWrap.CREATOR, parcel, arrayList, i2, 1);
                }
                linkedHashMap.put(createFromParcel, arrayList);
            }
            TextStickerTextPair createFromParcel2 = TextStickerTextPair.CREATOR.createFromParcel(parcel);
            int readInt3 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            return new TextStickerTextWrap(linkedHashMap, createFromParcel2, readInt3, z, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final TextStickerTextWrap[] newArray(int i) {
            return new TextStickerTextWrap[i];
        }
    };
    public final boolean hasFocus;
    public final boolean isReplaceString;
    public final int selectionStart;
    public final Map<TextStickerString, List<InteractTextStructWrap>> strMap;
    public final TextStickerTextPair strPair;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TextStickerTextWrap() {
        /*
            r8 = this;
            r1 = 0
            r3 = 0
            r6 = 31
            r0 = r8
            r2 = r1
            r4 = r3
            r5 = r3
            r7 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap.<init>():void");
    }

    private final TextStickerTextPair component2() {
        return this.strPair;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TextStickerTextWrap copy$default(TextStickerTextWrap textStickerTextWrap, Map map, TextStickerTextPair textStickerTextPair, int i, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            map = textStickerTextWrap.strMap;
        }
        if ((i2 & 2) != 0) {
            textStickerTextPair = textStickerTextWrap.strPair;
        }
        if ((i2 & 4) != 0) {
            i = textStickerTextWrap.selectionStart;
        }
        if ((i2 & 8) != 0) {
            z = textStickerTextWrap.hasFocus;
        }
        if ((i2 & 16) != 0) {
            z2 = textStickerTextWrap.isReplaceString;
        }
        return textStickerTextWrap.copy(map, textStickerTextPair, i, z, z2);
    }

    public final TextStickerTextWrap copy(Map<TextStickerString, ? extends List<InteractTextStructWrap>> strMap, TextStickerTextPair strPair, int i, boolean z, boolean z2) {
        o.LJIIIZ(strMap, "strMap");
        o.LJIIIZ(strPair, "strPair");
        return new TextStickerTextWrap(strMap, strPair, i, z, z2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.strMap, this.strPair, Integer.valueOf(this.selectionStart), Boolean.valueOf(this.hasFocus), Boolean.valueOf(this.isReplaceString)};
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public TextStickerTextWrap m112clone() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<TextStickerString, List<InteractTextStructWrap>> entry : this.strMap.entrySet()) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = entry.getValue().iterator();
            while (it.hasNext()) {
                arrayList.add(InteractTextStructWrap.copy$default((InteractTextStructWrap) it.next(), null, null, 3, null));
            }
            linkedHashMap.put(new TextStickerString(entry.getKey().getStr()), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<InteractTextStructWrap> it2 = this.strPair.second.iterator();
        while (it2.hasNext()) {
            arrayList2.add(InteractTextStructWrap.copy$default(it2.next(), null, null, 3, null));
        }
        boolean z = false;
        return new TextStickerTextWrap(linkedHashMap, new TextStickerTextPair(this.strPair.first, arrayList2), this.selectionStart, z, z, 24, null);
    }

    public final List<CreateAnchorInfo> getAnchorInfoList() {
        List<InteractTextStructWrap> list = this.strPair.second;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator<InteractTextStructWrap> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getStruct());
        }
        return arrayList;
    }

    public final TextStickerString[] getStickerStringArray() {
        return (TextStickerString[]) this.strMap.keySet().toArray(new TextStickerString[0]);
    }

    public final String[] getStrArray() {
        Set<TextStickerString> keySet = this.strMap.keySet();
        ArrayList arrayList = new ArrayList(C32I.LJJL(keySet, 10));
        Iterator<TextStickerString> it = keySet.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getStr());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public final String getText() {
        return this.strPair.first;
    }

    public final boolean isValid() {
        TextStickerString[] stickerStringArray;
        if (this.strMap.isEmpty() || this.isReplaceString || (stickerStringArray = getStickerStringArray()) == null) {
            return false;
        }
        for (TextStickerString textStickerString : stickerStringArray) {
            if (textStickerString.getStr().length() > 0 && s.LJZI(textStickerString.getStr()).toString().length() > 0) {
                return true;
            }
        }
        return false;
    }

    public final TextStickerTextPair safeStrPair() {
        if (this.strPair.second == null) {
            try {
                Field field = OSZ.class.getField("LJLILLLLZI");
                field.setAccessible(true);
                field.set(this.strPair, new ArrayList());
            } catch (Exception e) {
                H7B.LIZLLL(e);
            }
        }
        return this.strPair;
    }

    public final boolean getHasFocus() {
        return this.hasFocus;
    }

    public final int getSelectionStart() {
        return this.selectionStart;
    }

    public final Map<TextStickerString, List<InteractTextStructWrap>> getStrMap() {
        return this.strMap;
    }

    public final boolean isReplaceString() {
        return this.isReplaceString;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Map<TextStickerString, List<InteractTextStructWrap>> map = this.strMap;
        out.writeInt(map.size());
        for (Map.Entry<TextStickerString, List<InteractTextStructWrap>> entry : map.entrySet()) {
            entry.getKey().writeToParcel(out, i);
            Iterator LIZJ = UC7.LIZJ(entry.getValue(), out);
            while (LIZJ.hasNext()) {
                ((InteractTextStructWrap) LIZJ.next()).writeToParcel(out, i);
            }
        }
        this.strPair.writeToParcel(out, i);
        out.writeInt(this.selectionStart);
        out.writeInt(this.hasFocus ? 1 : 0);
        out.writeInt(this.isReplaceString ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TextStickerTextWrap(Map<TextStickerString, ? extends List<InteractTextStructWrap>> strMap, TextStickerTextPair strPair, int i, boolean z, boolean z2) {
        o.LJIIIZ(strMap, "strMap");
        o.LJIIIZ(strPair, "strPair");
        this.strMap = strMap;
        this.strPair = strPair;
        this.selectionStart = i;
        this.hasFocus = z;
        this.isReplaceString = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ TextStickerTextWrap(java.util.Map r3, com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextPair r4, int r5, boolean r6, boolean r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r2 = this;
            r0 = r8 & 1
            if (r0 == 0) goto L9
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
        L9:
            r0 = r8 & 2
            if (r0 == 0) goto L14
            com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextPair r4 = new com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextPair
            r1 = 3
            r0 = 0
            r4.<init>(r0, r0, r1, r0)
        L14:
            r0 = r8 & 4
            if (r0 == 0) goto L1e
            java.lang.String r0 = r4.first
            int r5 = r0.length()
        L1e:
            r0 = r8 & 8
            if (r0 == 0) goto L23
            r6 = 0
        L23:
            r0 = r8 & 16
            if (r0 == 0) goto L28
            r7 = 0
        L28:
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap.<init>(java.util.Map, com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextPair, int, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
