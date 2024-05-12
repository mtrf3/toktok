package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.effectplatform.model.DiffEffect;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.TemplateEffectExtra;
import com.ss.ugc.effectplatform.model.UrlModel;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class ESW implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new Effect[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel in) {
        boolean z;
        boolean z2;
        boolean z3;
        o.LJIIJ(in, "in");
        Effect.Companion.getClass();
        String readString = in.readString();
        ArrayList<String> createStringArrayList = in.createStringArrayList();
        ArrayList<String> createStringArrayList2 = in.createStringArrayList();
        String readString2 = in.readString();
        String readString3 = in.readString();
        String readString4 = in.readString();
        Parcelable readParcelable = in.readParcelable(Effect.class.getClassLoader());
        if (readParcelable != null) {
            UrlModel urlModel = (UrlModel) readParcelable;
            Parcelable readParcelable2 = in.readParcelable(Effect.class.getClassLoader());
            if (readParcelable2 != null) {
                UrlModel urlModel2 = (UrlModel) readParcelable2;
                Parcelable readParcelable3 = in.readParcelable(Effect.class.getClassLoader());
                if (readParcelable3 != null) {
                    UrlModel urlModel3 = (UrlModel) readParcelable3;
                    Parcelable readParcelable4 = in.readParcelable(Effect.class.getClassLoader());
                    if (readParcelable4 != null) {
                        UrlModel urlModel4 = (UrlModel) readParcelable4;
                        int readInt = in.readInt();
                        ArrayList<String> createStringArrayList3 = in.createStringArrayList();
                        ArrayList<String> createStringArrayList4 = in.createStringArrayList();
                        ArrayList<String> createStringArrayList5 = in.createStringArrayList();
                        String readString5 = in.readString();
                        ArrayList<String> createStringArrayList6 = in.createStringArrayList();
                        int readInt2 = in.readInt();
                        ArrayList arrayList = new ArrayList(readInt2);
                        while (readInt2 != 0) {
                            Parcelable readParcelable5 = in.readParcelable(Effect.class.getClassLoader());
                            if (readParcelable5 != null) {
                                arrayList.add(readParcelable5);
                                readInt2--;
                            } else {
                                throw new C37692Eqm("null cannot be cast to non-null type com.ss.ugc.effectplatform.model.Effect");
                            }
                        }
                        if (readString == null) {
                            readString = "";
                        }
                        if (createStringArrayList == null) {
                            createStringArrayList = new ArrayList<>();
                        }
                        if (readString2 == null) {
                            readString2 = "";
                        }
                        if (readString3 == null) {
                            readString3 = "";
                        }
                        if (readString4 == null) {
                            readString4 = "";
                        }
                        if (createStringArrayList3 == null) {
                            createStringArrayList3 = new ArrayList<>();
                        }
                        if (readString5 == null) {
                            readString5 = "";
                        }
                        String readString6 = in.readString();
                        int readInt3 = in.readInt();
                        int readInt4 = in.readInt();
                        String readString7 = in.readString();
                        if (readString7 == null) {
                            readString7 = "";
                        }
                        String readString8 = in.readString();
                        if (readString8 == null) {
                            readString8 = "";
                        }
                        String readString9 = in.readString();
                        if (readString9 == null) {
                            readString9 = "";
                        }
                        String readString10 = in.readString();
                        if (readString10 == null) {
                            readString10 = "";
                        }
                        ArrayList<String> createStringArrayList7 = in.createStringArrayList();
                        String readString11 = in.readString();
                        String readString12 = in.readString();
                        if (readString12 == null) {
                            readString12 = "";
                        }
                        String readString13 = in.readString();
                        if (readString13 == null) {
                            readString13 = "";
                        }
                        String readString14 = in.readString();
                        if (readString14 == null) {
                            readString14 = "";
                        }
                        if (in.readInt() == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        String readString15 = in.readString();
                        if (readString15 == null) {
                            readString15 = "";
                        }
                        if (in.readInt() == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        String readString16 = in.readString();
                        if (readString16 == null) {
                            readString16 = "";
                        }
                        ArrayList<String> createStringArrayList8 = in.createStringArrayList();
                        long readLong = in.readLong();
                        String readString17 = in.readString();
                        if (readString17 == null) {
                            readString17 = "";
                        }
                        ArrayList<String> createStringArrayList9 = in.createStringArrayList();
                        long readLong2 = in.readLong();
                        String readString18 = in.readString();
                        if (readString18 == null) {
                            readString18 = "";
                        }
                        ArrayList<String> createStringArrayList10 = in.createStringArrayList();
                        String readString19 = in.readString();
                        if (readString19 == null) {
                            readString19 = "";
                        }
                        String readString20 = in.readString();
                        if (readString20 == null) {
                            readString20 = "";
                        }
                        String readString21 = in.readString();
                        if (readString21 == null) {
                            readString21 = "";
                        }
                        if (in.readInt() == 1) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        String readString22 = in.readString();
                        if (readString22 == null) {
                            readString22 = "";
                        }
                        String readString23 = in.readString();
                        if (readString23 == null) {
                            readString23 = "";
                        }
                        String readString24 = in.readString();
                        String readString25 = in.readString();
                        String readString26 = in.readString();
                        String readString27 = in.readString();
                        Parcelable readParcelable6 = in.readParcelable(UrlModel.class.getClassLoader());
                        Parcelable parcelable = null;
                        if (!(readParcelable6 instanceof UrlModel)) {
                            readParcelable6 = null;
                        }
                        UrlModel urlModel5 = (UrlModel) readParcelable6;
                        String readString28 = in.readString();
                        String readString29 = in.readString();
                        long readLong3 = in.readLong();
                        Parcelable readParcelable7 = in.readParcelable(Effect.class.getClassLoader());
                        if (!(readParcelable7 instanceof TemplateEffectExtra)) {
                            readParcelable7 = null;
                        }
                        TemplateEffectExtra templateEffectExtra = (TemplateEffectExtra) readParcelable7;
                        String readString30 = in.readString();
                        Parcelable readParcelable8 = in.readParcelable(DiffEffect.class.getClassLoader());
                        if (readParcelable8 instanceof DiffEffect) {
                            parcelable = readParcelable8;
                        }
                        Effect effect = new Effect(readString, createStringArrayList, createStringArrayList2, readString2, readString3, readString4, urlModel, urlModel2, urlModel3, urlModel4, readInt, createStringArrayList3, createStringArrayList4, createStringArrayList5, readString5, createStringArrayList6, arrayList, readString6, readInt3, readInt4, readString7, readString8, readString9, readString10, createStringArrayList7, readString11, readString12, readString13, readString14, z, readString15, z2, readString16, createStringArrayList8, readLong, readString17, createStringArrayList9, readLong2, readString18, createStringArrayList10, readString19, readString20, readString21, z3, readString22, readString23, readString24, readString25, readString26, readString27, urlModel5, readString28, readString29, readLong3, templateEffectExtra, readString30, (DiffEffect) parcelable);
                        ArrayList<String> createStringArrayList11 = in.createStringArrayList();
                        if (createStringArrayList11 == null) {
                            createStringArrayList11 = new ArrayList<>();
                        }
                        effect.setRequirements(createStringArrayList11);
                        ArrayList<String> createStringArrayList12 = in.createStringArrayList();
                        if (createStringArrayList12 == null) {
                            createStringArrayList12 = new ArrayList<>();
                        }
                        effect.setTypes(createStringArrayList12);
                        effect.setModel_names(in.readString());
                        return effect;
                    }
                    throw new C37692Eqm("null cannot be cast to non-null type com.ss.ugc.effectplatform.model.UrlModel");
                }
                throw new C37692Eqm("null cannot be cast to non-null type com.ss.ugc.effectplatform.model.UrlModel");
            }
            throw new C37692Eqm("null cannot be cast to non-null type com.ss.ugc.effectplatform.model.UrlModel");
        }
        throw new C37692Eqm("null cannot be cast to non-null type com.ss.ugc.effectplatform.model.UrlModel");
    }
}
