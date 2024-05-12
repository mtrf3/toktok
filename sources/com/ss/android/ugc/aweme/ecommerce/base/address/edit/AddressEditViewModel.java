package com.ss.android.ugc.aweme.ecommerce.base.address.edit;

import X.C00F;
import X.C117634jX;
import X.C169696lJ;
import X.C22510uV;
import X.C253009wO;
import X.C26059AKp;
import X.C26717Ae9;
import X.C26721AeD;
import X.C26867AgZ;
import X.C27021Aj3;
import X.C27096AkG;
import X.C27100AkK;
import X.C27194Alq;
import X.C27196Als;
import X.C27221AmH;
import X.C27230AmQ;
import X.C27241Amb;
import X.C27242Amc;
import X.C27243Amd;
import X.C27258Ams;
import X.C27264Amy;
import X.C27267An1;
import X.C27268An2;
import X.C27269An3;
import X.C27278AnC;
import X.C27333Ao5;
import X.C27739Aud;
import X.C2NU;
import X.C36636EZk;
import X.C36671EaJ;
import X.C47261Igj;
import X.C56179M3b;
import X.C65330PkU;
import X.C65352Pkq;
import X.C68112lr;
import X.C70932Rse;
import X.C73969T1h;
import X.C76542zS;
import X.C76800UCe;
import X.C780334l;
import X.C78565UsT;
import X.C78685UuP;
import X.C78897Uxp;
import X.C78946Uyc;
import X.C78983UzD;
import X.C78996UzQ;
import X.C85990Xow;
import X.FKM;
import X.InterfaceC60061Nhh;
import X.InterfaceC65784Pro;
import X.InterfaceC68122ls;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.MBB;
import X.OJD;
import X.ORZ;
import X.OSZ;
import X.PVC;
import X.T16;
import X.X1D;
import X.XKQ;
import X.XKX;
import Y.AfS3S0100100_4;
import Y.AfS43S0300000_4;
import Y.AfS56S0100000_4;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.util.Base64;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.api.AddressApi;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressClaimVoucherInfo;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressLocation;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressPromotionInfo;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressVoucherInfo;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandDetailPlaceResponse;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputDataOptions;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ChangeOrderShippingAddressRequest;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ChangeOrderShippingAddressResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CheckShippingAddressData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClientConfig;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.GetPromotionRequest;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.MapLocateData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.MapLocateEvent;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.SaveRequest;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.TrackParams;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.events.ZipCodeSelectedEvent;
import com.ss.android.ugc.aweme.ecommerce.global.address.edit.GlobalAddressEditViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import defpackage.e1;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS108S0300000_4;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS29S0001000_4;
import kotlin.jvm.internal.AqS47S0110000_4;
import kotlin.jvm.internal.AqS47S1200000_4;
import kotlin.jvm.internal.AqS9S0010000_4;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes5.dex */
public class AddressEditViewModel extends JediViewModel<AddressEditState> implements InterfaceC60061Nhh {
    public static final /* synthetic */ int LLJJIJIIJIL = 0;
    public Region LJLJLJ;
    public Address LJLJLLL;
    public List<Region> LJLL;
    public List<Region> LJLLI;
    public boolean LJLLJ;
    public HashMap<String, Object> LJLLLL;
    public C27241Amb LJLLLLLL;
    public OSZ<String, Address> LJLZ;
    public AddressPageStarter.AddressEditEnterParams LJZ;
    public InputItemData LJZI;
    public boolean LJZL;
    public boolean LLD;
    public boolean LLF;
    public Address LLFF;
    public Address LLFFF;
    public Address LLFII;
    public AqS170S0100000_4 LLI;
    public MapLocateData LLIFFJFJJ;
    public String LLII;
    public String LLIIII;
    public String LLIIIILZ;
    public boolean LLIIIL;
    public ClientConfig LLIIJI;
    public ExceptionUX LLIIL;
    public Integer LLIILII;
    public int LLIILZL;
    public GetPromotionRequest LLIIZ;
    public AddressPromotionInfo LLIL;
    public String LLILII;
    public boolean LLILIL;
    public XKQ LLILLIZIL;
    public List<String> LLILLJJLI;
    public Map<String, String> LLILLL;
    public long LLJ;
    public long LLJI;
    public int LLJIJIL;
    public boolean LLJILJIL;
    public Set<String> LLJILLL;
    public boolean LLJJ;
    public final boolean LJLJJLL = true;
    public String LJLJL = "\n";
    public String LJLLILLLL = CardStruct.IStatusCode.DEFAULT;
    public String LJLLL = "";
    public long LL = -1;
    public long LLFZ = -1;
    public boolean LLIIIJ = true;
    public final C117634jX<InterfaceC88472Yns<CandInputDataOptions, C76800UCe>> LLIIIZ = new LinkedList<T>() { // from class: X.4jX
        public /* bridge */ int getSize() {
            return super.size();
        }

        @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque, java.util.Queue
        public boolean add(T t) {
            if (t != null && (!isEmpty())) {
                clear();
            }
            return super.add(t);
        }

        @Override // java.util.LinkedList, java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public final /* bridge */ T remove(int i) {
            return (T) removeAt(i);
        }

        public /* bridge */ Object removeAt(int i) {
            return super.remove(i);
        }
    };
    public final Map<String, C27221AmH> LLIIJLIL = new LinkedHashMap();
    public final List<InterfaceC68122ls> LLILL = new ArrayList();
    public String LLILZ = "Enter up to 79 characters";
    public String LLILZIL = "Name should not contain emoji";
    public String LLILZLL = "Address should not contain emoji.";
    public String LLIZ = "default";
    public final C27333Ao5 LLIZLLLIL = new C27333Ao5(0);
    public boolean LLJILJILJ = true;
    public final C27264Amy LLJJI = new C27264Amy(this);
    public final C27278AnC LLJJIII = new C27278AnC(this);
    public final List<String> LLJJIJI = C47261Igj.LJJIJIIJI("name", "phone", "address", "zipcode", "email", "address_other_detail");

    public View Mv0(int i, View focused, RecyclerView recyclerView) {
        o.LJIIIZ(focused, "focused");
        return null;
    }

    public int Rv0() {
        return 3;
    }

    public boolean Zv0() {
        return this instanceof GlobalAddressEditViewModel;
    }

    public void bw0(CheckShippingAddressData checkShippingAddressData, int i) {
    }

    public C27021Aj3 uw0(Address address, C27021Aj3 c27021Aj3) {
        return null;
    }

    public final C253009wO Jv0() {
        ClientConfig clientConfig;
        String str;
        String str2;
        String str3;
        C27021Aj3 c27021Aj3;
        List list;
        String str4;
        InputItemData inputItemData = this.LJZI;
        if (inputItemData == null || (clientConfig = inputItemData.config) == null || (str = clientConfig.concatenateNameRule) == null || (str2 = clientConfig.concatenateNameKeys) == null || (str3 = clientConfig.concatenateNameError) == null || str3.length() == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        List LJLJJL = s.LJLJJL(str2, new String[]{","}, 0, 6);
        Iterator<C27021Aj3> it = hw0().iterator();
        while (true) {
            if (it.hasNext()) {
                c27021Aj3 = it.next();
                Integer num = c27021Aj3.LIZ.type;
                if (num != null && num.intValue() == -101) {
                    break;
                }
            } else {
                c27021Aj3 = null;
                break;
            }
        }
        C27021Aj3 c27021Aj32 = c27021Aj3;
        if (c27021Aj32 != null) {
            Object obj = c27021Aj32.LIZIZ;
            if ((obj instanceof List) && (list = (List) obj) != null) {
                String str5 = "";
                int i = 0;
                for (Object obj2 : list) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        C27021Aj3 c27021Aj33 = (C27021Aj3) obj2;
                        if (ORZ.LJLJJI(c27021Aj33.LIZ.key, LJLJJL)) {
                            Object obj3 = c27021Aj33.LIZIZ;
                            if ((obj3 instanceof String) && (str4 = (String) obj3) != null) {
                                if (i != 0 && str4.length() > 0 && str5.length() > 0) {
                                    sb.append(" ");
                                }
                                sb.append(str4);
                                str5 = str4;
                            }
                        }
                        i = i2;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }
        }
        try {
            byte[] decode = Base64.decode(str, 0);
            o.LJIIIIZZ(decode, "decode(rule, Base64.DEFAULT)");
            OJD ojd = new OJD(new String(decode, PVC.LIZ));
            String sb2 = sb.toString();
            o.LJIIIIZZ(sb2, "allKeyStringBuilder.toString()");
            if (!ojd.containsMatchIn(sb2)) {
                return null;
            }
            return new C253009wO(str3, null, true, 2);
        } catch (IllegalArgumentException e) {
            C78983UzD.LJIJ(e, "Base64 decode failed");
            return null;
        }
    }

    public final void Lv0() {
        setState(C27258Ams.LJLIL);
        C27096AkG c27096AkG = AddressApi.LIZ;
        String str = this.LJLLILLLL;
        c27096AkG.getClass();
        disposeOnClear(C27096AkG.LIZIZ(str).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS56S0100000_4(this, 11), new AfS56S0100000_4(this, 12)));
    }

    public final C27241Amb Wv0() {
        C27241Amb c27241Amb = this.LJLLLLLL;
        if (c27241Amb != null) {
            return c27241Amb;
        }
        o.LJIJI("logger2");
        throw null;
    }

    public final boolean dw0() {
        String str;
        ClientConfig clientConfig;
        InputItemData inputItemData = this.LJZI;
        if (inputItemData != null && (clientConfig = inputItemData.config) != null) {
            str = clientConfig.concatenateAddressRule;
        } else {
            str = null;
        }
        return C78685UuP.LJJJZ(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
    
        r0 = r1.config;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0019, code lost:
    
        if (r0 == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001b, code lost:
    
        r2 = r0.concatenateAddressKeys;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001d, code lost:
    
        if (r9 == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0021, code lost:
    
        if (r2 == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        if (r2.length() != 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002a, code lost:
    
        r3 = ujb.s.LJLJJL(r2, new java.lang.String[]{","}, 0, 6);
        r11 = hw0().iterator();
        r7 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        if (r11.hasNext() == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        r1 = r11.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
    
        if (X.ORZ.LJLJJI(r1.LIZ.key, r3) == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        r2 = r1.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        if (r2 == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
    
        r1 = X.X1D.LIZ();
        r1.append(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        if ((r2 instanceof java.lang.String) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        r2 = (java.lang.String) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
    
        if (r2 != null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        r1.append(r2);
        r7 = X.X1D.LIZIZ(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0069, code lost:
    
        r2 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0072, code lost:
    
        r2 = android.util.Base64.decode(r9, 0);
        kotlin.jvm.internal.o.LJIIIIZZ(r2, "decode(clientConfig, Base64.DEFAULT)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008b, code lost:
    
        if (new X.OJD(new java.lang.String(r2, X.PVC.LIZ)).containsMatchIn(r7) == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a2, code lost:
    
        return new X.C253009wO(r6, null, true, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a3, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0094, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0095, code lost:
    
        X.C78983UzD.LJIJ(r1, "Base64 decode failed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0029, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009b, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0015, code lost:
    
        if (r1 != null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x009e, code lost:
    
        if (r1 != null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0011, code lost:
    
        if (r6 != null) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C253009wO ew0() {
        /*
            r12 = this;
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData r1 = r12.LJZI
            r4 = 0
            if (r1 == 0) goto L9d
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClientConfig r0 = r1.config
            if (r0 == 0) goto L9d
            java.lang.String r9 = r0.concatenateAddressRule
        Lb:
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClientConfig r0 = r1.config
            if (r0 == 0) goto L13
            java.lang.String r6 = r0.concatenateAddressError
            if (r6 != 0) goto L17
        L13:
            java.lang.String r6 = r12.LLILZ
            if (r1 == 0) goto L9b
        L17:
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClientConfig r0 = r1.config
            if (r0 == 0) goto L9b
            java.lang.String r2 = r0.concatenateAddressKeys
        L1d:
            if (r9 == 0) goto L29
            r5 = 1
            r8 = 0
            if (r2 == 0) goto L29
            int r0 = r2.length()
            if (r0 != 0) goto L2a
        L29:
            return r4
        L2a:
            java.lang.String r0 = ","
            java.lang.String[] r1 = new java.lang.String[]{r0}
            r0 = 6
            java.util.List r3 = ujb.s.LJLJJL(r2, r1, r8, r0)
            java.util.List r0 = r12.hw0()
            java.util.Iterator r11 = r0.iterator()
            java.lang.String r10 = ""
            r7 = r10
        L40:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L72
            java.lang.Object r1 = r11.next()
            X.Aj3 r1 = (X.C27021Aj3) r1
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemDTO r0 = r1.LIZ
            java.lang.String r0 = r0.key
            boolean r0 = X.ORZ.LJLJJI(r0, r3)
            if (r0 == 0) goto L40
            java.lang.Object r2 = r1.LIZIZ
            if (r2 == 0) goto L40
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            r1.append(r7)
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L69
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L6a
        L69:
            r2 = r10
        L6a:
            r1.append(r2)
            java.lang.String r7 = X.X1D.LIZIZ(r1)
            goto L40
        L72:
            X.OJD r3 = new X.OJD     // Catch: java.lang.IllegalArgumentException -> L94
            byte[] r2 = android.util.Base64.decode(r9, r8)     // Catch: java.lang.IllegalArgumentException -> L94
            java.lang.String r0 = "decode(clientConfig, Base64.DEFAULT)"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)     // Catch: java.lang.IllegalArgumentException -> L94
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.IllegalArgumentException -> L94
            java.nio.charset.Charset r0 = X.PVC.LIZ     // Catch: java.lang.IllegalArgumentException -> L94
            r1.<init>(r2, r0)     // Catch: java.lang.IllegalArgumentException -> L94
            r3.<init>(r1)     // Catch: java.lang.IllegalArgumentException -> L94
            boolean r0 = r3.containsMatchIn(r7)     // Catch: java.lang.IllegalArgumentException -> L94
            if (r0 == 0) goto La3
            X.9wO r1 = new X.9wO     // Catch: java.lang.IllegalArgumentException -> L94
            r0 = 2
            r1.<init>(r6, r4, r5, r0)     // Catch: java.lang.IllegalArgumentException -> L94
            goto La2
        L94:
            r1 = move-exception
            java.lang.String r0 = "Base64 decode failed"
            X.C78983UzD.LJIJ(r1, r0)
            goto L29
        L9b:
            r2 = r4
            goto L1d
        L9d:
            r9 = r4
            if (r1 == 0) goto L13
            goto Lb
        La2:
            return r1
        La3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel.ew0():X.9wO");
    }

    public final boolean gw0() {
        boolean LJ;
        Region region = this.LJLJLJ;
        if (Build.VERSION.SDK_INT >= 23 && C56179M3b.LIZ.LJIILIIL("ttshop", "ship_address") && e1.LIZ(31744, "ecom_address_map_location", true, false) && C78996UzQ.LJIIZILJ() != null && region != null) {
            Region LJIIZILJ = C78996UzQ.LJIIZILJ();
            String str = null;
            if (LJIIZILJ != null && LJIIZILJ.code != null && region.code != null) {
                Region LJIIZILJ2 = C78996UzQ.LJIIZILJ();
                if (LJIIZILJ2 != null) {
                    str = LJIIZILJ2.code;
                }
                LJ = o.LJ(str, region.code);
            } else {
                Region LJIIZILJ3 = C78996UzQ.LJIIZILJ();
                if (LJIIZILJ3 != null && LJIIZILJ3.name != null && region.name != null) {
                    Region LJIIZILJ4 = C78996UzQ.LJIIZILJ();
                    if (LJIIZILJ4 != null) {
                        str = LJIIZILJ4.name;
                    }
                    LJ = o.LJ(str, region.name);
                }
            }
            if (LJ) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final AddressEditState kv0() {
        return new AddressEditState(0, null, null, null, null, false, null, null, null, null, null, null, false, 8191, null);
    }

    public final void kw0() {
        List<AddressItem> list;
        List<AddressItem> list2;
        List<AddressItem> list3;
        AddressItem addressItem;
        ArrayList arrayList = new ArrayList();
        Address address = this.LJLJLLL;
        if (address == null || (list = address.items) == null || list.isEmpty()) {
            arrayList.add("phone");
            arrayList.add("email");
        } else {
            Address address2 = this.LJLJLLL;
            AddressItem addressItem2 = null;
            if (address2 != null && (list3 = address2.items) != null) {
                Iterator<AddressItem> it = list3.iterator();
                while (true) {
                    if (it.hasNext()) {
                        addressItem = it.next();
                        if (o.LJ(addressItem.key, "phone")) {
                            break;
                        }
                    } else {
                        addressItem = null;
                        break;
                    }
                }
                AddressItem addressItem3 = addressItem;
                if (addressItem3 != null && addressItem3.value == null) {
                    arrayList.add("phone");
                }
            }
            Address address3 = this.LJLJLLL;
            if (address3 != null && (list2 = address3.items) != null) {
                Iterator<AddressItem> it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    AddressItem next = it2.next();
                    if (o.LJ(next.key, "email")) {
                        addressItem2 = next;
                        break;
                    }
                }
                AddressItem addressItem4 = addressItem2;
                if (addressItem4 != null && addressItem4.value == null) {
                    arrayList.add("email");
                }
            }
        }
        withState(new AqS135S0200000_4(this, (AddressEditViewModel) arrayList, (List<String>) 246));
    }

    public final Address Ov0() {
        return Nv0(hw0(), true);
    }

    public final int Vv0() {
        String str;
        ArrayList arrayList;
        String str2;
        List<AddressItem> list;
        List<Region> list2;
        String str3;
        List<C27021Aj3> inputItemVOList = lv0().getInputItemVOList();
        if (inputItemVOList.isEmpty()) {
            return 0;
        }
        Set<String> set = this.LLJILLL;
        if (set == null || set.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (C27021Aj3 c27021Aj3 : inputItemVOList) {
                Integer num = c27021Aj3.LIZ.type;
                if (num == null || (num.intValue() != -100 && num.intValue() != -101)) {
                    if (c27021Aj3.LJI && (str = c27021Aj3.LIZ.key) != null) {
                        linkedHashSet.add(str);
                    }
                } else {
                    Object obj = c27021Aj3.LIZIZ;
                    if ((obj instanceof ArrayList) && (arrayList = (ArrayList) obj) != null) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            C27021Aj3 c27021Aj32 = (C27021Aj3) it.next();
                            if (c27021Aj32.LJI && (str2 = c27021Aj32.LIZ.key) != null) {
                                linkedHashSet.add(str2);
                            }
                        }
                    }
                }
            }
            this.LLJILLL = linkedHashSet;
        }
        Set<String> set2 = this.LLJILLL;
        if (set2 != null) {
            Address Nv0 = Nv0(inputItemVOList, true);
            if (Nv0 == null || (list = Nv0.items) == null || list.isEmpty()) {
                return 0;
            }
            List<AddressItem> list3 = Nv0.items;
            if (list3 != null) {
                for (AddressItem addressItem : list3) {
                    if (ORZ.LJLJJI(addressItem.key, set2) && ((str3 = addressItem.value) == null || str3.length() == 0)) {
                        return 0;
                    }
                }
            }
            if (set2.contains("region") && Nv0.region == null) {
                return 0;
            }
            if (set2.contains("districts") && ((list2 = Nv0.districts) == null || list2.isEmpty())) {
                return 0;
            }
        }
        return 1;
    }

    public final List<C27021Aj3> hw0() {
        return lv0().getInputItemVOList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r1 == true) goto L20;
     */
    @Override // com.bytedance.jedi.arch.JediViewModel, androidx.lifecycle.ViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCleared() {
        /*
            r2 = this;
            super.onCleared()
            X.XKQ r0 = r2.LLILLIZIL
            if (r0 == 0) goto L36
            boolean r1 = r0.isActive()
            r0 = 1
            if (r1 != r0) goto L36
        Le:
            r1 = 0
            if (r0 == 0) goto L18
            X.XKQ r0 = r2.LLILLIZIL
            if (r0 == 0) goto L18
            r0.LIZIZ(r1)
        L18:
            java.util.List<X.2ls> r0 = r2.LLILL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.clear()
            r2.LLILLIZIL = r1
            r2.LLJILLL = r1
            com.ss.android.ugc.aweme.ecommerce.service.IEventCenter r1 = X.C26059AKp.LIZ()
            java.lang.String r0 = "ec_zipcode_selected_event"
            r1.LIZIZ(r0, r2)
            com.ss.android.ugc.aweme.ecommerce.service.IEventCenter r1 = X.C26059AKp.LIZ()
            java.lang.String r0 = "ec_address_map_locate_event"
            r1.LIZIZ(r0, r2)
            return
        L36:
            r0 = 0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel.onCleared():void");
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void onStart() {
        XKQ LJJIJ;
        super.onStart();
        if (this.LLILLIZIL == null) {
            LJJIJ = C78565UsT.LJJIJ(this, MBB.INSTANCE, new C68112lr(this, null));
            this.LLILLIZIL = LJJIJ;
        }
        C26059AKp.LIZ().LIZJ("ec_zipcode_selected_event", this);
        C26059AKp.LIZ().LIZJ("ec_address_map_locate_event", this);
    }

    public final boolean yw0() {
        if (Zv0() && !this.LLJILJIL && this.LLILLJJLI == null) {
            String lowerCase = C85990Xow.LIZ().toLowerCase(Locale.ROOT);
            o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (o.LJ(lowerCase, "sa") || C00F.LIZ(31744, 0, "address_draft_enable", true) != 0) {
                return true;
            }
        }
        return false;
    }

    public boolean Xv0() {
        return this.LJLJJLL;
    }

    public static String Sv0(int i) {
        String LIZIZ;
        int i2 = i / 3600;
        int i3 = (i - (i2 * 3600)) / 60;
        int i4 = i % 60;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("");
        StringBuilder LIZ2 = X1D.LIZ();
        if (i2 < 10) {
            LIZ2.append('0');
        }
        LIZ2.append(i2);
        LIZ2.append(':');
        LIZ.append(X1D.LIZIZ(LIZ2));
        String LIZIZ2 = X1D.LIZIZ(LIZ);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(LIZIZ2);
        StringBuilder LIZ4 = X1D.LIZ();
        if (i3 < 10) {
            LIZ4.append('0');
        }
        LIZ4.append(i3);
        LIZ4.append(':');
        LIZ3.append(X1D.LIZIZ(LIZ4));
        String LIZIZ3 = X1D.LIZIZ(LIZ3);
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append(LIZIZ3);
        if (i4 >= 10) {
            LIZIZ = String.valueOf(i4);
        } else {
            LIZIZ = C169696lJ.LIZIZ('0', i4);
        }
        LIZ5.append(LIZIZ);
        return X1D.LIZIZ(LIZ5);
    }

    public static int Yv0(long j) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(j);
        return C22510uV.LIZ(gregorianCalendar.get(12), 60, gregorianCalendar.get(11) * 3600, gregorianCalendar.get(13));
    }

    public final C253009wO Aw0(C27021Aj3 item) {
        List<C27021Aj3> list;
        Integer num;
        o.LJIIIZ(item, "item");
        Integer num2 = item.LIZ.type;
        if ((num2 == null || num2.intValue() != -100) && ((num = item.LIZ.type) == null || num.intValue() != -101)) {
            return Bw0(item);
        }
        Object obj = item.LIZIZ;
        if ((obj instanceof List) && (list = (List) obj) != null) {
            boolean z = false;
            for (C27021Aj3 c27021Aj3 : list) {
                if (c27021Aj3 != null && Bw0(c27021Aj3).LIZ != null) {
                    z = true;
                }
            }
            if (z) {
                return new C253009wO("", null, false, 6);
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x013a, code lost:
    
        if (r7.equals("last_name") == false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0151, code lost:
    
        r7 = new com.ss.android.ugc.aweme.ecommerce.base.address.dto.Rule(r12.LLILZIL, null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0141, code lost:
    
        if (r7.equals("address_detail") == false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0167, code lost:
    
        r7 = new com.ss.android.ugc.aweme.ecommerce.base.address.dto.Rule(r12.LLILZLL, null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0148, code lost:
    
        if (r7.equals("name") == false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x014f, code lost:
    
        if (r7.equals("first_name") != false) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x015d, code lost:
    
        if (r7.equals("address") == false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0164, code lost:
    
        if (r7.equals("geo_l3") == false) goto L223;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x012c  */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [T, com.ss.android.ugc.aweme.ecommerce.base.address.dto.Rule] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C253009wO Bw0(X.C27021Aj3 r13) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel.Bw0(X.Aj3):X.9wO");
    }

    public final String Hv0(Address address) {
        int i;
        List<AddressItem> list;
        List<AddressItem> list2;
        StringBuilder sb = new StringBuilder();
        if (address != null && (list2 = address.items) != null) {
            i = list2.size();
        } else {
            i = 0;
        }
        if (address != null && (list = address.items) != null) {
            for (AddressItem addressItem : list) {
                String str = addressItem.value;
                if (str != null && str.length() != 0) {
                    if (ORZ.LJLJJI(addressItem.key, this.LLJJIJI)) {
                        sb.append(addressItem.key);
                        i--;
                        if (i > 0) {
                            sb.append(",");
                        }
                    }
                }
            }
        }
        if (s.LJJLI(sb, ",")) {
            sb.deleteCharAt(sb.length() - 1);
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "sb.toString()");
        return sb2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x00e3, code lost:
    
        if (r1.length() != 0) goto L408;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:166:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x02a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0306 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v43, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Iv0(X.C27021Aj3 r9) {
        /*
            Method dump skipped, instructions count: 828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel.Iv0(X.Aj3):void");
    }

    public final boolean cw0(String str) {
        String str2;
        String str3;
        Region region = this.LJLJLJ;
        if (region != null && (str3 = region.code) != null) {
            str2 = str3.toLowerCase(Locale.ROOT);
            o.LJIIIIZZ(str2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        } else {
            str2 = null;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (!o.LJ(str2, lowerCase)) {
            return false;
        }
        return true;
    }

    public final void fw0(Address addressToSave) {
        String str;
        String str2;
        String str3;
        String str4;
        Integer num;
        AddressVoucherInfo addressVoucherInfo;
        AddressVoucherInfo addressVoucherInfo2;
        o.LJIIIZ(addressToSave, "addressToSave");
        String str5 = "";
        Integer num2 = null;
        AddressClaimVoucherInfo addressClaimVoucherInfo = null;
        num2 = null;
        if (this.LLILLJJLI == null) {
            List<AddressItem> list = addressToSave.items;
            int i = 1;
            if (list == null || list.isEmpty()) {
                setState(C27267An1.LJLIL);
                C78983UzD.LJIILL("saveAddressReal failed because send null address");
                return;
            }
            if (this.LLJJ) {
                return;
            }
            this.LLJJ = true;
            setState(C27268An2.LJLIL);
            boolean LJ = o.LJ(this.LJLLILLLL, CardStruct.IStatusCode.DEFAULT);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            AddressPromotionInfo addressPromotionInfo = this.LLIL;
            if (addressPromotionInfo != null && (addressVoucherInfo2 = addressPromotionInfo.addressVoucher) != null) {
                str3 = addressVoucherInfo2.voucherId;
            } else {
                str3 = null;
            }
            boolean LJ2 = o.LJ(str3, "");
            AddressPromotionInfo addressPromotionInfo2 = this.LLIL;
            if (addressPromotionInfo2 != null && (addressVoucherInfo = addressPromotionInfo2.addressVoucher) != null) {
                str4 = addressVoucherInfo.voucherTypeId;
            } else {
                str4 = null;
            }
            Integer valueOf = Integer.valueOf(this.LLIILZL);
            AddressPromotionInfo addressPromotionInfo3 = this.LLIL;
            if (addressPromotionInfo3 != null) {
                num = addressPromotionInfo3.addressVoucherType;
            } else {
                num = null;
            }
            AddressClaimVoucherInfo addressClaimVoucherInfo2 = new AddressClaimVoucherInfo(str4, valueOf, num);
            C27096AkG c27096AkG = AddressApi.LIZ;
            if (!LJ) {
                i = 2;
            }
            if (LJ2) {
                addressClaimVoucherInfo = addressClaimVoucherInfo2;
            }
            c27096AkG.getClass();
            disposeOnClear(C36671EaJ.LIZIZ(((AddressApi) C27096AkG.LIZIZ.create(AddressApi.class)).saveAddress(new SaveRequest(addressToSave, i, addressClaimVoucherInfo)), "shipping_address", new OSZ[0]).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new C27242Amc(this, LJ, addressToSave, elapsedRealtime), new AfS56S0100000_4(this, 117)));
            return;
        }
        setState(C27269An3.LJLIL);
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        Map<String, String> map = this.LLILLL;
        if (map != null && (str2 = map.get("change_addr_order_type")) != null) {
            num2 = Integer.valueOf(CastIntegerProtector.parseInt(str2));
        }
        Map<String, String> map2 = this.LLILLL;
        if (map2 != null && (str = map2.get("change_addr_order_id")) != null) {
            str5 = str;
        }
        AddressApi.LIZ.getClass();
        disposeOnClear(C36671EaJ.LIZIZ(((AddressApi) C27096AkG.LIZIZ.create(AddressApi.class)).changeOnOrder(new ChangeOrderShippingAddressRequest(num2, str5, "", null, null, addressToSave)), "shipping_address", new OSZ[0]).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS3S0100100_4(elapsedRealtime2, this, 8), new AfS56S0100000_4(this, 116)));
    }

    public final void nw0(Context context) {
        String str;
        AddressLocation addressLocation;
        String str2;
        Object obj;
        String str3;
        MapLocateData mapLocateData = this.LLIFFJFJJ;
        if (mapLocateData != null) {
            MapLocateData.Companion.getClass();
            HashMap LIZ = C27194Alq.LIZ(mapLocateData);
            HashMap<String, Object> hashMap = this.LJLLLL;
            if (hashMap != null) {
                hashMap.putAll(LIZ);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("start_click_time", Long.valueOf(System.currentTimeMillis()));
                hashMap2.put("previous_page", "shipping_address");
                if (this.LLFF == null) {
                    str = "add";
                } else {
                    str = "edit";
                }
                hashMap2.put("fill_type", str);
                Region region = this.LJLJLJ;
                if (region != null && (str3 = region.code) != null) {
                    String lowerCase = str3.toLowerCase(Locale.ROOT);
                    o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    hashMap2.put("location", lowerCase);
                }
                HashMap<String, Object> hashMap3 = this.LJLLLL;
                String str4 = null;
                if (hashMap3 != null && (obj = hashMap3.get("entrance_info")) != null) {
                    hashMap2.put("entrance_info", obj);
                }
                hashMap.put("trackParams", hashMap2);
                InputItemData inputItemData = this.LJZI;
                if (inputItemData != null && (addressLocation = inputItemData.addressLocation) != null && (str2 = addressLocation.addressMapSchema) != null) {
                    C26867AgZ.LIZIZ(context, str2, hashMap, false).open();
                }
                boolean z = this.LJZL;
                long j = this.LL;
                Region region2 = this.LJLJLJ;
                if (region2 != null) {
                    str4 = region2.code;
                }
                lw0("", j, str4, true, z);
            }
        }
    }

    public final void rw0(boolean z) {
        setStateImmediate(new AqS9S0010000_4(z, 4));
    }

    public final void sw0(int i) {
        setState(new AqS29S0001000_4(i, 0));
    }

    public final void vw0(Address address) {
        setState(new AqS135S0200000_4(this, address, 9));
    }

    public final void Kv0(String str, String str2) {
        Object obj;
        Object obj2;
        Object obj3;
        Number number;
        Object obj4;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        Object obj5;
        String str9;
        String str10;
        String str11;
        String str12;
        HashMap<String, Object> LJII = C27739Aud.LJII(str);
        HashMap<String, Object> LJII2 = C27739Aud.LJII(str2);
        Long l = null;
        String str13 = null;
        if (LJII != null) {
            obj = LJII.get("coupon_id");
        } else {
            obj = null;
        }
        if (LJII2 != null) {
            obj2 = LJII2.get("voucher_id");
            obj3 = LJII2.get("claim_voucher_status_code");
        } else {
            obj2 = null;
            obj3 = null;
        }
        if (obj3 instanceof Number) {
            number = (Number) obj3;
        } else {
            number = null;
        }
        if (o.LJ(obj, "-1")) {
            if (obj2 != null && !o.LJ(obj2, "")) {
                Wv0();
                HashMap<String, Object> hashMap = this.LJLLLL;
                if (hashMap != null) {
                    obj5 = hashMap.get("entrance_info");
                } else {
                    obj5 = null;
                }
                String str14 = (String) obj5;
                if (obj2 instanceof String) {
                    str9 = (String) obj2;
                } else {
                    str9 = null;
                }
                Object obj6 = LJII.get("coupon_type_id");
                if (obj6 instanceof String) {
                    str10 = (String) obj6;
                } else {
                    str10 = null;
                }
                Object obj7 = LJII.get("coupon_name");
                if (obj7 instanceof String) {
                    str11 = (String) obj7;
                } else {
                    str11 = null;
                }
                Object obj8 = LJII.get("coupon_type");
                if (obj8 instanceof String) {
                    str12 = (String) obj8;
                } else {
                    str12 = null;
                }
                Object obj9 = LJII.get("coupon_type_info");
                if (obj9 instanceof String) {
                    str13 = (String) obj9;
                }
                C27241Amb.LIZLLL(str14, str9, str10, str11, str12, str13, Boolean.TRUE, 0L);
                return;
            }
            Wv0();
            HashMap<String, Object> hashMap2 = this.LJLLLL;
            if (hashMap2 != null) {
                obj4 = hashMap2.get("entrance_info");
            } else {
                obj4 = null;
            }
            if (obj4 instanceof String) {
                str3 = (String) obj4;
            } else {
                str3 = null;
            }
            if (obj2 instanceof String) {
                str4 = (String) obj2;
            } else {
                str4 = null;
            }
            Object obj10 = LJII.get("coupon_type_id");
            if (obj10 instanceof String) {
                str5 = (String) obj10;
            } else {
                str5 = null;
            }
            Object obj11 = LJII.get("coupon_name");
            if (obj11 instanceof String) {
                str6 = (String) obj11;
            } else {
                str6 = null;
            }
            Object obj12 = LJII.get("coupon_type");
            if (obj12 instanceof String) {
                str7 = (String) obj12;
            } else {
                str7 = null;
            }
            Object obj13 = LJII.get("coupon_type_info");
            if (obj13 instanceof String) {
                str8 = (String) obj13;
            } else {
                str8 = null;
            }
            Boolean bool = Boolean.FALSE;
            if (number != null) {
                l = Long.valueOf(number.longValue());
            }
            C27241Amb.LIZLLL(str3, str4, str5, str6, str7, str8, bool, l);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x007d. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0063 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address Nv0(java.util.List<X.C27021Aj3> r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel.Nv0(java.util.List, boolean):com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address");
    }

    public final void Pv0(String str, InterfaceC88472Yns<? super CandInputDataOptions, C76800UCe> interfaceC88472Yns) {
        withState(new AqS47S1200000_4(this, (AddressEditViewModel) str, (String) interfaceC88472Yns, (InterfaceC88472Yns<? super CandInputDataOptions, C76800UCe>) 2));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02d0, code lost:
    
        if (r6 != null) goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x031c, code lost:
    
        if (r11.equals("region") == false) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x034c, code lost:
    
        r0 = r43.LJLJLJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x034e, code lost:
    
        if (r0 == null) goto L453;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0350, code lost:
    
        r9 = r0.code;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0352, code lost:
    
        if (r9 == null) goto L453;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0358, code lost:
    
        if (ujb.o.LJJJJJL(r9) == false) goto L455;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0374, code lost:
    
        r10 = X.C86804Y4y.LJLJL.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x037e, code lost:
    
        if (r10.hasNext() == false) goto L520;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0380, code lost:
    
        r7 = r10.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x038d, code lost:
    
        if (kotlin.jvm.internal.o.LJ(((X.C86804Y4y) r7).LJLJI, r9) == false) goto L521;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x038f, code lost:
    
        r7 = (X.C86804Y4y) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0391, code lost:
    
        if (r7 == null) goto L453;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0393, code lost:
    
        r9 = r7.LJLJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0395, code lost:
    
        if (r9 == null) goto L453;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0397, code lost:
    
        r7 = new X.OSZ(r9, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x039f, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x035a, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x032c, code lost:
    
        if (r7.equals("phone") == false) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x03aa, code lost:
    
        if (r7.equals("email") == false) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x03b8, code lost:
    
        r20 = false;
        r28 = null;
        r0 = new X.C27021Aj3(r1, X.C79043V0l.LJ(r1.key, r44.getInputItemVOList()), false, r21, false, null, 236);
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x03b4, code lost:
    
        if (r7.equals("name") == false) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0324, code lost:
    
        if (r7.equals("alternate_phone") == false) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0330, code lost:
    
        r7 = (X.OSZ) X.C79043V0l.LJ(r1.key, r44.getInputItemVOList());
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x033c, code lost:
    
        if (r7 == null) goto L447;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x033e, code lost:
    
        r0 = (java.lang.String) r7.getSecond();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0344, code lost:
    
        if (r0 == null) goto L447;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x034a, code lost:
    
        if (ujb.o.LJJJJJL(r0) == false) goto L466;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x03a1, code lost:
    
        if (r7 != null) goto L454;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x035b, code lost:
    
        r20 = false;
        r28 = null;
        r0 = new X.C27021Aj3(r1, r7, false, r21, false, null, 236);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x020a, code lost:
    
        if (r9 != null) goto L373;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:39:0x009b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01dd  */
    /* JADX WARN: Type inference failed for: r28v2, types: [X.9wO, java.lang.Integer] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<X.C27021Aj3> iw0(com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditState r44, com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData r45) {
        /*
            Method dump skipped, instructions count: 1084
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel.iw0(com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditState, com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData):java.util.List");
    }

    @Override // X.InterfaceC60061Nhh
    public final void onEvent(String eventName, String str) {
        String str2;
        o.LJIIIZ(eventName, "eventName");
        String str3 = null;
        try {
            if (o.LJ(eventName, "ec_zipcode_selected_event")) {
                Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str, C65330PkU.LIZJ(C65352Pkq.LJI(ZipCodeSelectedEvent.class)));
                if (!(fromJson instanceof ZipCodeSelectedEvent)) {
                    fromJson = null;
                }
                ZipCodeSelectedEvent zipCodeSelectedEvent = (ZipCodeSelectedEvent) fromJson;
                if (zipCodeSelectedEvent != null && (str2 = zipCodeSelectedEvent.zipcode) != null) {
                    xw0(C47261Igj.LJJIJ(new C27230AmQ("zipcode", null)), new AqS186S0100000_4(str2, 305));
                }
            } else if (o.LJ(eventName, "ec_address_map_locate_event")) {
                Object fromJson2 = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str, C65330PkU.LIZJ(C65352Pkq.LJI(MapLocateData.class)));
                if (!(fromJson2 instanceof MapLocateData)) {
                    fromJson2 = null;
                }
                MapLocateData mapLocateData = (MapLocateData) fromJson2;
                if (mapLocateData != null) {
                    String str4 = "";
                    if (C27196Als.LIZ()) {
                        this.LLII = mapLocateData.autoCompleteAddressId;
                        TrackParams trackParams = mapLocateData.trackParams;
                        if (trackParams != null) {
                            str3 = trackParams.addressResult;
                        }
                        this.LLIIIILZ = str3;
                        String str5 = mapLocateData.sessionKey;
                        if (str5 != null) {
                            str4 = str5;
                        }
                        this.LLIIII = str4;
                        Address address = mapLocateData.shippingAddress;
                        if (address != null) {
                            vw0(address);
                        }
                    } else {
                        String str6 = mapLocateData.autoCompleteAddressId;
                        if (str6 == null || str6.length() == 0) {
                            return;
                        }
                        String str7 = mapLocateData.autoCompleteAddressId;
                        this.LLII = str7;
                        TrackParams trackParams2 = mapLocateData.trackParams;
                        if (trackParams2 != null) {
                            str3 = trackParams2.addressResult;
                        }
                        this.LLIIIILZ = str3;
                        String str8 = mapLocateData.sessionKey;
                        if (str8 != null) {
                            str4 = str8;
                        }
                        this.LLIIII = str4;
                        jw0(mapLocateData.shippingAddress, str4, str7, null, new AqS170S0100000_4(this, 178));
                    }
                }
            }
        } catch (com.google.gson.s unused) {
        }
    }

    public final void tw0(C253009wO c253009wO, String str) {
        ArrayList arrayList;
        if (str.length() == 0) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (C27021Aj3 c27021Aj3 : hw0()) {
            Integer num = c27021Aj3.LIZ.type;
            if (num == null || num.intValue() != -101) {
                arrayList2.add(c27021Aj3);
            } else {
                Object obj = c27021Aj3.LIZIZ;
                if (obj instanceof ArrayList) {
                    arrayList = (ArrayList) obj;
                } else {
                    arrayList = null;
                }
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C27021Aj3 c27021Aj32 = (C27021Aj3) it.next();
                        if (o.LJ(c27021Aj32.LIZ.key, str)) {
                            if (o.LJ(c27021Aj32.LIZ.key, "first_name")) {
                                if (C78897Uxp.LJJIJL(c27021Aj32.LIZJ)) {
                                    c27021Aj32.LIZJ = c253009wO;
                                } else {
                                    C253009wO c253009wO2 = c27021Aj32.LIZJ;
                                    if (c253009wO2 != null && c253009wO2.LIZJ) {
                                        c27021Aj32.LIZJ = c253009wO;
                                    }
                                }
                            } else {
                                c27021Aj32.LIZJ = c253009wO;
                            }
                        }
                    }
                }
                arrayList2.add(C27021Aj3.LIZ(c27021Aj3, arrayList, c253009wO, false, false, null, 121));
            }
        }
        setState(new AqS170S0100000_4(arrayList2, (List<? extends Object>) 179));
    }

    public final void ww0(String str, InterfaceC88472Yns<? super C27021Aj3, C27021Aj3> updater) {
        o.LJIIIZ(updater, "updater");
        xw0(C47261Igj.LJJIJ(new C27230AmQ(str, null)), new AqS186S0100000_4(updater, (InterfaceC88472Yns<? super InterfaceC65784Pro<C76800UCe>, C76800UCe>) 14));
    }

    public final void xw0(List<C27230AmQ> list, InterfaceC88471Ynr<? super C27021Aj3, ? super C27230AmQ, C27021Aj3> updater) {
        o.LJIIIZ(updater, "updater");
        setState(new AqS135S0200000_4((List) list, (List<C27230AmQ>) updater, (InterfaceC88471Ynr<? super C27021Aj3, ? super C27230AmQ, C27021Aj3>) 10));
    }

    public static void ow0(int i, Integer num, String str) {
        C26059AKp.LIZ().LIZ("ec_address_locate_status", C27739Aud.LJI(new MapLocateEvent(i, num, str)));
    }

    public final void Qv0(String str, Address address, InterfaceC88472Yns<? super CandInputDataOptions, C76800UCe> interfaceC88472Yns) {
        FKM.LIZ();
        try {
            if (C2NU.LIZ.LIZIZ() && str != null && str.length() != 0 && address != null) {
                C78565UsT.LJJIJ(this, MBB.INSTANCE, new C26717Ae9(this, str, address, interfaceC88472Yns, null));
            }
        } catch (Exception unused) {
        }
    }

    public void aw0(Address address, CheckShippingAddressData checkShippingAddressData, Integer num) {
        Integer num2;
        o.LJIIIZ(address, "address");
        if (num == null || num.intValue() != 3) {
            return;
        }
        if (checkShippingAddressData == null || checkShippingAddressData.verifyData == null || (num2 = checkShippingAddressData.verifyData.status) == null || num2.intValue() != 1) {
            fw0(address);
            return;
        }
        if (checkShippingAddressData.verifyData.tipInfo != null) {
            C26059AKp.LIZ().LIZ("ec_show_check_address_result", C27739Aud.LJI(checkShippingAddressData));
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        fw0(address);
    }

    public final void mw0(boolean z, ChangeOrderShippingAddressResponseData changeOrderShippingAddressResponseData, long j) {
        AddressEditFragment addressEditFragment = AddressEditFragment.LLD;
        if (addressEditFragment != null) {
            C78946Uyc.LJJII(addressEditFragment, new C70932Rse(), new C27243Amd(z, changeOrderShippingAddressResponseData, this, j));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00fb A[Catch: Exception -> 0x0178, TryCatch #1 {Exception -> 0x0178, blocks: (B:11:0x00f4, B:12:0x00f7, B:14:0x00fb, B:16:0x0103, B:17:0x0107, B:19:0x010d, B:22:0x0120, B:24:0x0124, B:26:0x012b, B:28:0x016f, B:34:0x0131, B:36:0x0135, B:37:0x0139, B:39:0x013f, B:42:0x0152, B:44:0x0156, B:46:0x015d, B:49:0x0164), top: B:10:0x00f4 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zw0(X.C27021Aj3 r11, java.lang.String r12, X.InterfaceC67352kd<? super X.C253009wO> r13) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel.zw0(X.Aj3, java.lang.String, X.2kd):java.lang.Object");
    }

    public final void Tv0(Integer num, Boolean bool, Boolean bool2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        Integer num2;
        FKM.LIZ();
        if (C2NU.LIZ.LIZIZ()) {
            this.LLIILII = num;
            if (!o.LJ(bool, Boolean.FALSE)) {
                sw0(0);
            }
            Wv0().LIZIZ = SystemClock.elapsedRealtime();
            if (C27100AkK.LIZ()) {
                num2 = 1;
            } else {
                num2 = null;
            }
            C27096AkG c27096AkG = AddressApi.LIZ;
            Region region = this.LJLJLJ;
            c27096AkG.getClass();
            disposeOnClear(C36671EaJ.LIZIZ(C27096AkG.LJFF(region, num, num2), "shipping_address", new OSZ[0]).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS43S0300000_4(this, interfaceC65784Pro, bool2, 0), new AfS56S0100000_4(this, 13)));
            return;
        }
        sw0(2);
    }

    public final void pw0(InputItemData inputItemData, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, Boolean bool, Boolean bool2) {
        this.LJLJLJ = inputItemData.regionInfo;
        this.LLIIJI = inputItemData.config;
        setState(new AqS108S0300000_4(this, inputItemData, bool, 5));
        if (o.LJ(bool2, Boolean.TRUE)) {
            withState(new AqS47S0110000_4(this, true, 16));
        }
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void qw0(AddressEditViewModel addressEditViewModel, InputItemData inputItemData, InterfaceC65784Pro interfaceC65784Pro, Boolean bool, int i) {
        Boolean bool2 = null;
        if ((i & 2) != 0) {
            interfaceC65784Pro = null;
        }
        if ((i & 4) != 0) {
            bool = Boolean.TRUE;
        }
        if ((i & 8) != 0) {
            bool2 = Boolean.FALSE;
        }
        addressEditViewModel.pw0(inputItemData, interfaceC65784Pro, bool, bool2);
    }

    public final void jw0(Address address, String str, String str2, Integer num, InterfaceC88472Yns<? super CandDetailPlaceResponse, C76800UCe> interfaceC88472Yns) {
        if (address == null || str == null || str2 == null || str2.length() == 0) {
            return;
        }
        XKX.LIZLLL(C780334l.LJLIL, C36636EZk.LIZ, null, new C26721AeD(this, address, str, str2, num, interfaceC88472Yns, null), 2);
    }

    public final void lw0(String str, long j, String str2, boolean z, boolean z2) {
        Object obj;
        C27241Amb Wv0 = Wv0();
        HashMap<String, Object> hashMap = this.LJLLLL;
        if (hashMap != null) {
            obj = hashMap.get("entrance_info");
        } else {
            obj = null;
        }
        HashMap hashMap2 = new HashMap();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("");
        LIZ.append(z ? 1 : 0);
        hashMap2.put("is_success", X1D.LIZIZ(LIZ));
        if (str != null) {
            hashMap2.put("fail_reason", str);
        }
        hashMap2.put("is_retry", Integer.valueOf(z2 ? 1 : 0));
        hashMap2.put("duration", Long.valueOf(j));
        if (str2 != null) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            hashMap2.put("location", lowerCase);
        }
        if (obj != null) {
            hashMap2.put("entrance_info", obj);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(Wv0.LIZ);
        linkedHashMap.putAll(hashMap2);
        C76542zS.LIZ("tiktokec_auto_location_result", linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void Uv0(AddressEditViewModel addressEditViewModel, Integer num, Boolean bool, Boolean bool2, InterfaceC65784Pro interfaceC65784Pro, int i) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            bool = null;
        }
        if ((i & 4) != 0) {
            bool2 = Boolean.TRUE;
        }
        if ((i & 8) != 0) {
            interfaceC65784Pro = null;
        }
        addressEditViewModel.Tv0(num, bool, bool2, interfaceC65784Pro);
    }
}
