package X;

import Y.IDDListenerS21S0300000_1;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionOption;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.3z3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C101773z3 {
    public final Context LIZ;

    public C101773z3(Context context) {
        o.LJIIIZ(context, "context");
        this.LIZ = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.List] */
    public final TuxSheet LIZ(FragmentManager fragmentManager, EnumC101803z6 sheetMode, InterfaceC101673yt interfaceC101673yt, EnumC101483ya defaultSelection) {
        ?? arrayList;
        List<PrivacySettingsRestrictionOption> values;
        C101833z9 c101833z9;
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        int i2;
        boolean z4;
        int i3;
        ArrayList arrayList2;
        List<PrivacySettingsRestrictionOption> values2;
        C101833z9 c101833z92;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        o.LJIIIZ(sheetMode, "sheetMode");
        o.LJIIIZ(defaultSelection, "defaultSelection");
        ASL asl = new ASL();
        Context context = this.LIZ;
        int i4 = C101793z5.LIZ[sheetMode.ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                Context context2 = this.LIZ;
                List LJJIJIL = C47261Igj.LJJIJIL(C101913zH.LIZ);
                PrivacySettingsRestrictionItem LIZJ = a.LJIILIIL().LIZJ(0, "chatsets");
                if (LIZJ != null && (values2 = LIZJ.getValues()) != null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (PrivacySettingsRestrictionOption privacySettingsRestrictionOption : values2) {
                        if (privacySettingsRestrictionOption.getShowType() == 0) {
                            arrayList3.add(privacySettingsRestrictionOption);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(C32I.LJJL(arrayList3, 10));
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        arrayList4.add(Integer.valueOf(((PrivacySettingsRestrictionOption) it.next()).getValue()));
                    }
                    List LLJILJILJ = ORZ.LLJILJILJ(arrayList4);
                    ArrayList arrayList5 = (ArrayList) LLJILJILJ;
                    int lastIndexOf = arrayList5.lastIndexOf(4);
                    if (lastIndexOf > -1) {
                        ListProtector.add(LLJILJILJ, arrayList5.lastIndexOf(2), ListProtector.get(LLJILJILJ, lastIndexOf));
                        ORS.LJJLL(LLJILJILJ);
                    }
                    arrayList2 = new ArrayList(C32I.LJJL(LLJILJILJ, 10));
                    Iterator it2 = arrayList5.iterator();
                    while (it2.hasNext()) {
                        int intValue = ((Number) it2.next()).intValue();
                        if (intValue != 1) {
                            if (intValue != 2) {
                                if (intValue != 3) {
                                    if (intValue != 4) {
                                        c101833z92 = new C101833z9(31, null, null, null, null, false);
                                    } else {
                                        String string = context2.getString(R.string.err);
                                        String LIZIZ = OKG.LIZIZ(string, "context.getString(R.stri…ver_permission_suggested)", context2, R.string.ers, "context.getString(R.stri…rmission_suggested2_desc)");
                                        Integer valueOf = Integer.valueOf(R.raw.icon_person_fill);
                                        if (defaultSelection == EnumC101483ya.MAF) {
                                            z8 = true;
                                        } else {
                                            z8 = false;
                                        }
                                        c101833z92 = new C101833z9(valueOf, 4, string, LIZIZ, z8);
                                    }
                                } else {
                                    String string2 = context2.getString(R.string.erp);
                                    o.LJIIIIZZ(string2, "context.getString(R.stri…eceiver_permission_noOne)");
                                    Integer valueOf2 = Integer.valueOf(R.raw.icon_lock_fill);
                                    if (defaultSelection == EnumC101483ya.NO_ONE) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    c101833z92 = new C101833z9(2, valueOf2, 3, string2, null, z7);
                                }
                            } else {
                                String string3 = context2.getString(R.string.erk);
                                String LIZIZ2 = OKG.LIZIZ(string3, "context.getString(R.stri…eiver_permission_friends)", context2, R.string.erm, "context.getString(R.stri…_permission_friends_desc)");
                                Integer valueOf3 = Integer.valueOf(R.raw.icon_person_arrow_left_right_fill);
                                if (defaultSelection == EnumC101483ya.FRIENDS) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                c101833z92 = new C101833z9(valueOf3, 2, string3, LIZIZ2, z6);
                            }
                        } else {
                            String string4 = context2.getString(R.string.erh);
                            o.LJIIIIZZ(string4, "context.getString(R.stri…iver_permission_everyone)");
                            Integer valueOf4 = Integer.valueOf(R.raw.icon_earth_w_fill);
                            if (defaultSelection == EnumC101483ya.EVERYONE) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            c101833z92 = new C101833z9(2, valueOf4, 1, string4, null, z5);
                        }
                        arrayList2.add(c101833z92);
                    }
                    i3 = -1;
                } else {
                    i3 = -1;
                    arrayList2 = new ArrayList();
                }
                if (!arrayList2.isEmpty()) {
                    if (!arrayList2.isEmpty()) {
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            if (((C101833z9) it3.next()).LIZLLL) {
                                break;
                            }
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        Iterator it4 = arrayList2.iterator();
                        while (it4.hasNext()) {
                            Integer num = ((C101833z9) it4.next()).LJ;
                            if (num != null && num.intValue() == 2) {
                                Iterator it5 = arrayList2.iterator();
                                int i5 = 0;
                                while (true) {
                                    if (!it5.hasNext()) {
                                        break;
                                    }
                                    Integer num2 = ((C101833z9) it5.next()).LJ;
                                    if (num2 == null || num2.intValue() != 2) {
                                        i5++;
                                    } else {
                                        i3 = i5;
                                        break;
                                    }
                                }
                                ((C101833z9) ListProtector.get(arrayList2, i3)).LIZLLL = true;
                            }
                        }
                    }
                    ((C101833z9) ORZ.LJLLJ(arrayList2)).LIZLLL = true;
                }
                arrayList = ORZ.LLIIIZ(arrayList2, LJJIJIL);
            } else {
                throw new C162476Zf();
            }
        } else {
            int i6 = 2;
            Context context3 = this.LIZ;
            PrivacySettingsRestrictionItem LIZJ2 = a.LJIILIIL().LIZJ(0, "chatsets");
            if (LIZJ2 != null && (values = LIZJ2.getValues()) != null) {
                ArrayList arrayList6 = new ArrayList();
                for (PrivacySettingsRestrictionOption privacySettingsRestrictionOption2 : values) {
                    if (privacySettingsRestrictionOption2.getShowType() == 0) {
                        arrayList6.add(privacySettingsRestrictionOption2);
                    }
                }
                ArrayList arrayList7 = new ArrayList(C32I.LJJL(arrayList6, 10));
                Iterator it6 = arrayList6.iterator();
                while (it6.hasNext()) {
                    arrayList7.add(Integer.valueOf(((PrivacySettingsRestrictionOption) it6.next()).getValue()));
                }
                List LLJILJILJ2 = ORZ.LLJILJILJ(arrayList7);
                ArrayList arrayList8 = (ArrayList) LLJILJILJ2;
                int lastIndexOf2 = arrayList8.lastIndexOf(4);
                if (lastIndexOf2 > -1) {
                    ListProtector.add(LLJILJILJ2, arrayList8.lastIndexOf(2), ListProtector.get(LLJILJILJ2, lastIndexOf2));
                    ORS.LJJLL(LLJILJILJ2);
                }
                arrayList = new ArrayList(C32I.LJJL(LLJILJILJ2, 10));
                Iterator it7 = arrayList8.iterator();
                while (it7.hasNext()) {
                    int intValue2 = ((Number) it7.next()).intValue();
                    if (intValue2 != 1) {
                        if (intValue2 != i6) {
                            if (intValue2 != 3) {
                                if (intValue2 != 4) {
                                    c101833z9 = new C101833z9(31, null, null, null, null, false);
                                } else {
                                    String string5 = context3.getString(R.string.eoq);
                                    o.LJIIIIZZ(string5, "context.getString(R.stri…m_maf_settings_suggested)");
                                    if (C53332KwS.LIZ()) {
                                        i2 = R.string.elg;
                                    } else {
                                        i2 = R.string.eor;
                                    }
                                    String string6 = context3.getString(i2);
                                    o.LJIIIIZZ(string6, "context.getString(if (Dm…_settings_suggested_body)");
                                    if (defaultSelection == EnumC101483ya.MAF) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    c101833z9 = new C101833z9(4, null, 4, string5, string6, z4);
                                }
                            } else {
                                String string7 = context3.getString(R.string.eoo);
                                String LIZIZ3 = OKG.LIZIZ(string7, "context.getString(R.string.dm_maf_settings_noone)", context3, R.string.eop, "context.getString(R.stri…_maf_settings_noone_body)");
                                if (defaultSelection == EnumC101483ya.NO_ONE) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                c101833z9 = new C101833z9(4, null, 3, string7, LIZIZ3, z3);
                            }
                        } else {
                            String string8 = context3.getString(R.string.jbq);
                            o.LJIIIIZZ(string8, "context.getString(R.string.only_friends)");
                            if (C53332KwS.LIZ()) {
                                i = R.string.gnw;
                            } else {
                                i = R.string.enj;
                            }
                            String string9 = context3.getString(i);
                            o.LJIIIIZZ(string9, "context.getString(if (Dm…R.string.dm_friends_desc)");
                            if (defaultSelection == EnumC101483ya.FRIENDS) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            c101833z9 = new C101833z9(4, null, 2, string8, string9, z2);
                        }
                    } else {
                        String string10 = context3.getString(R.string.eol);
                        String LIZIZ4 = OKG.LIZIZ(string10, "context.getString(R.stri…settings_everyone_header)", context3, R.string.eok, "context.getString(R.stri…f_settings_everyone_body)");
                        if (defaultSelection == EnumC101483ya.EVERYONE) {
                            z = true;
                        } else {
                            z = false;
                        }
                        c101833z9 = new C101833z9(4, null, 1, string10, LIZIZ4, z);
                    }
                    arrayList.add(c101833z9);
                    i6 = 2;
                }
            } else {
                arrayList = new ArrayList();
            }
        }
        C101783z4 c101783z4 = new C101783z4(context, sheetMode, arrayList);
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLLI = c101783z4;
        tuxSheet.LJLILLLLZI = new IDDListenerS21S0300000_1(sheetMode, interfaceC101673yt, defaultSelection, 1);
        tuxSheet.show(fragmentManager, "DMSettingsSheet");
        return tuxSheet;
    }
}
