package com.ss.android.ugc.aweme.ecommerce.base.address.edit.helper;

import X.AnonymousClass636;
import X.C0JU;
import X.C16880lQ;
import X.C221108m2;
import X.C252989wM;
import X.C253009wO;
import X.C26045AKb;
import X.C26059AKp;
import X.C26706Ady;
import X.C26867AgZ;
import X.C27021Aj3;
import X.C27241Amb;
import X.C27276AnA;
import X.C27277AnB;
import X.C27301AnZ;
import X.C27306Ane;
import X.C27452Aq0;
import X.C27570Aru;
import X.C27739Aud;
import X.C36636EZk;
import X.C51029K0z;
import X.C5H3;
import X.C65330PkU;
import X.C65352Pkq;
import X.C76542zS;
import X.C76800UCe;
import X.C78996UzQ;
import X.InterfaceC60061Nhh;
import X.InterfaceC88472Yns;
import X.ORS;
import X.ORZ;
import X.OSZ;
import X.ViewOnClickListenerC13880ga;
import X.XKX;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputDataOptions;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClientConfig;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemDTO;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.MapLocateEvent;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.SelectDistrictEvent;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.dynamicstyle.addressitem.IRegionSelectHelperStyle;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AqS108S0300000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS47S1200000_4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import wg5.c;

/* loaded from: classes5.dex */
public final class RegionSelectHelper implements InterfaceC60061Nhh, c {
    public static final C27306Ane Companion = new C27306Ane();
    public final C5H3 dynamicStyle$delegate;
    public final FragmentManager fragmentManager;
    public boolean hasErrorCheck;
    public C27021Aj3 inputItem;
    public final C252989wM targetView;
    public final AddressEditViewModel viewModel;
    public final boolean zipcodeRecommend;

    /* JADX WARN: Removed duplicated region for block: B:13:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void bindDistrict() {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.address.edit.helper.RegionSelectHelper.bindDistrict():void");
    }

    private final void bindRegion() {
        Object obj;
        C27570Aru.LJII(-2, this.targetView);
        C27021Aj3 c27021Aj3 = this.inputItem;
        Region region = null;
        if (c27021Aj3 != null) {
            obj = c27021Aj3.LIZIZ;
        } else {
            obj = null;
        }
        if (obj instanceof Region) {
            region = (Region) obj;
        }
        if (region != null) {
            ((TextView) this.targetView.LIZIZ(R.id.l3h)).setText(region.name);
        } else {
            ((TextView) this.targetView.LIZIZ(R.id.l3h)).setText("");
        }
        View LIZIZ = this.targetView.LIZIZ(R.id.bt5);
        o.LJIIIIZZ(LIZIZ, "targetView.contentView");
        C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 13, 42), LIZIZ);
    }

    private final IRegionSelectHelperStyle getDynamicStyle() {
        return (IRegionSelectHelperStyle) this.dynamicStyle$delegate.getValue();
    }

    private final void sendAutoLocateShowLog() {
        String str;
        AddressEditViewModel addressEditViewModel = this.viewModel;
        C27241Amb Wv0 = addressEditViewModel.Wv0();
        boolean LJJIIJ = C78996UzQ.LJJIIJ();
        Region region = addressEditViewModel.LJLJLJ;
        if (region != null) {
            str = region.code;
        } else {
            str = null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("is_allow", Integer.valueOf(LJJIIJ ? 1 : 0));
        if (str != null) {
            hashMap.put("location", str);
        }
        Wv0.LIZJ("location", hashMap);
    }

    private final void setText() {
        Object obj;
        List list;
        String str;
        String string;
        Boolean bool;
        Boolean bool2;
        C27021Aj3 c27021Aj3 = this.inputItem;
        if (c27021Aj3 != null) {
            obj = c27021Aj3.LIZIZ;
        } else {
            obj = null;
        }
        if (obj instanceof List) {
            list = (List) obj;
        } else {
            list = null;
        }
        if (list != null) {
            ClientConfig clientConfig = this.viewModel.LLIIJI;
            if (clientConfig != null && (bool2 = clientConfig.enableDistrictReverseOrder) != null && bool2.booleanValue()) {
                list = ORZ.LLIILII(list);
            }
            TextView textView = (TextView) this.targetView.LIZIZ(R.id.l3h);
            AddressEditViewModel addressEditViewModel = this.viewModel;
            ClientConfig clientConfig2 = addressEditViewModel.LLIIJI;
            if (clientConfig2 != null && (bool = clientConfig2.enableSingleLineRegion) != null && bool.booleanValue()) {
                addressEditViewModel.LJLJL = ",";
            }
            textView.setText(C27301AnZ.LIZ(list, addressEditViewModel.LJLJL));
            ClientConfig clientConfig3 = this.viewModel.LLIIJI;
            if (clientConfig3 != null && (str = clientConfig3.addressDistrictLength) != null) {
                try {
                    if (!this.hasErrorCheck && str.length() > 0 && list.size() < CastIntegerProtector.parseInt(str)) {
                        ClientConfig clientConfig4 = this.viewModel.LLIIJI;
                        if (clientConfig4 == null || (string = clientConfig4.addressDistrictInCompletError) == null || string.length() == 0) {
                            string = this.targetView.getContext().getString(R.string.f6p);
                        }
                        this.targetView.LJ(new C253009wO(string, null, false, 6));
                    }
                } catch (Exception unused) {
                }
                this.hasErrorCheck = true;
                return;
            }
            return;
        }
        ((TextView) this.targetView.LIZIZ(R.id.l3h)).setText("");
    }

    public final void sendAutoLocateClickLog() {
        String str;
        AddressEditViewModel addressEditViewModel = this.viewModel;
        C27241Amb Wv0 = addressEditViewModel.Wv0();
        boolean LJJIIJ = C78996UzQ.LJJIIJ();
        boolean z = addressEditViewModel.LJZL;
        Region region = addressEditViewModel.LJLJLJ;
        if (region != null) {
            str = region.code;
        } else {
            str = null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("is_allow", Integer.valueOf(LJJIIJ ? 1 : 0));
        hashMap.put("is_retry", Integer.valueOf(z ? 1 : 0));
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            hashMap.put("location", lowerCase);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(Wv0.LIZ);
        linkedHashMap.putAll(hashMap);
        linkedHashMap.put("button_name", "location");
        C76542zS.LIZ("tiktokec_button_click", linkedHashMap);
    }

    public final void showLoadingIcon() {
        this.viewModel.LLIIIJ = false;
        ((TuxIconView) this.targetView.LIZIZ(R.id.eyd)).setIconRes(R.raw.icon_spinner_normal);
        ((TuxIconView) this.targetView.LIZIZ(R.id.eyd)).setTintColorRes(R.attr.eb);
    }

    public final void showLocateIcon() {
        this.viewModel.LLIIIJ = true;
        ((TuxIconView) this.targetView.LIZIZ(R.id.eyd)).setIconRes(R.raw.icon_map_pin_fill);
        ((TuxIconView) this.targetView.LIZIZ(R.id.eyd)).setTintColorRes(R.attr.eb);
    }

    @Override // wg5.c
    public String getViewName() {
        return C26706Ady.LIZ(this);
    }

    public final void onCreate() {
        C26059AKp.LIZ().LIZJ("ec_address_locate_status", this);
        C26059AKp.LIZ().LIZJ("ec_district_select", this);
    }

    public final void onDestroy() {
        C26059AKp.LIZ().LIZIZ("ec_address_locate_status", this);
        C26059AKp.LIZ().LIZIZ("ec_district_select", this);
    }

    public final FragmentManager getFragmentManager() {
        return this.fragmentManager;
    }

    public final C27021Aj3 getInputItem() {
        return this.inputItem;
    }

    public final C252989wM getTargetView() {
        return this.targetView;
    }

    public final AddressEditViewModel getViewModel() {
        return this.viewModel;
    }

    public final void handleSelectDistrict(List<Region> list) {
        Object obj;
        Object obj2;
        Object obj3;
        InputItemDTO inputItemDTO;
        String str;
        String LIZ = C27301AnZ.LIZ(list, ",");
        C27021Aj3 c27021Aj3 = this.inputItem;
        if (c27021Aj3 != null) {
            obj = c27021Aj3.LIZIZ;
        } else {
            obj = null;
        }
        if (!o.LJ(LIZ, C27301AnZ.LIZ(obj, ","))) {
            this.viewModel.LJLLJ = true;
            C27021Aj3 c27021Aj32 = this.inputItem;
            if (c27021Aj32 != null && (inputItemDTO = c27021Aj32.LIZ) != null && (str = inputItemDTO.key) != null) {
                EventCenter.LJ().LIZ("ec_address_item_value_change", C27739Aud.LJI(C51029K0z.LJJIIZI(new OSZ("key", str))));
            }
        }
        C27021Aj3 c27021Aj33 = this.inputItem;
        if (c27021Aj33 != null) {
            obj2 = c27021Aj33.LIZIZ;
            c27021Aj33.LIZIZ = list;
        } else {
            obj2 = null;
        }
        setText();
        if (this.zipcodeRecommend) {
            AddressEditViewModel addressEditViewModel = this.viewModel;
            C252989wM view = this.targetView;
            FragmentManager fragmentManager = this.fragmentManager;
            addressEditViewModel.getClass();
            o.LJIIIZ(view, "view");
            addressEditViewModel.withState(new AqS47S1200000_4(addressEditViewModel, (AddressEditViewModel) "zipcode", (String) new AqS108S0300000_4(fragmentManager, view, addressEditViewModel, 45), (InterfaceC88472Yns<? super CandInputDataOptions, C76800UCe>) 2));
        }
        if (this.viewModel.LLF) {
            C27021Aj3 c27021Aj34 = this.inputItem;
            if (c27021Aj34 != null) {
                obj3 = c27021Aj34.LIZIZ;
            } else {
                obj3 = null;
            }
            if (!o.LJ(obj3, obj2)) {
                C253009wO c253009wO = new C253009wO(this.targetView.getContext().getString(R.string.fdd), null, false, 6);
                C27021Aj3 c27021Aj35 = this.inputItem;
                if (c27021Aj35 != null) {
                    c27021Aj35.LIZJ = c253009wO;
                }
                this.targetView.LJ(c253009wO);
                this.viewModel.LLF = false;
                this.viewModel.LLJ = SystemClock.elapsedRealtime();
            }
        }
        C27021Aj3 c27021Aj36 = this.inputItem;
        if (c27021Aj36 != null) {
            c27021Aj36.LIZJ = null;
        }
        this.targetView.LIZJ();
        this.viewModel.LLJ = SystemClock.elapsedRealtime();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0064, code lost:
    
        if (r2.equals("districts") == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007d, code lost:
    
        bindDistrict();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007a, code lost:
    
        if (r2.equals("geo_l1") == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBind(X.C27021Aj3 r4) {
        /*
            r3 = this;
            java.lang.String r0 = "item"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            r3.inputItem = r4
            X.9wM r2 = r3.targetView
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemDTO r0 = r4.LIZ
            java.lang.String r0 = r0.title
            r2.setTitle(r0)
            r0 = 2131377607(0x7f0a3dc7, float:1.8375423E38)
            android.view.View r1 = r2.LIZIZ(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemDTO r0 = r4.LIZ
            java.lang.String r0 = r0.hint
            r1.setHint(r0)
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.dynamicstyle.addressitem.IRegionSelectHelperStyle r0 = r3.getDynamicStyle()
            boolean r0 = r0.getShowErrorWhenClickSaveButton()
            if (r0 != 0) goto L38
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel r0 = r3.viewModel
            X.2at r0 = r0.lv0()
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditState r0 = (com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditState) r0
            boolean r0 = r0.isAllKeyItemFilled()
            if (r0 == 0) goto L3f
        L38:
            X.9wO r0 = r4.LIZJ
            if (r0 == 0) goto L81
            r2.LJ(r0)
        L3f:
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemDTO r0 = r4.LIZ
            java.lang.String r2 = r0.key
            if (r2 == 0) goto L58
            int r1 = r2.hashCode()
            r0 = -1249487629(0xffffffffb58654f3, float:-1.0008501E-6)
            if (r1 == r0) goto L74
            r0 = -934795532(0xffffffffc84826f4, float:-204955.81)
            if (r1 == r0) goto L67
            r0 = 367869605(0x15ed3ea5, float:9.5822373E-26)
            if (r1 == r0) goto L5e
        L58:
            boolean r0 = r4.LJFF
            r3.setEditableStyle(r0)
            return
        L5e:
            java.lang.String r0 = "districts"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L7d
            goto L58
        L67:
            java.lang.String r0 = "region"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L70
            goto L58
        L70:
            r3.bindRegion()
            goto L58
        L74:
            java.lang.String r0 = "geo_l1"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L7d
            goto L58
        L7d:
            r3.bindDistrict()
            goto L58
        L81:
            r2.LIZJ()
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.address.edit.helper.RegionSelectHelper.onBind(X.Aj3):void");
    }

    public void setEditableStyle(boolean z) {
        if (z) {
            return;
        }
        this.targetView.setOnClickListener(new ViewOnClickListenerC13880ga(null));
        if (getDynamicStyle().getTitleGrayedInUneditable()) {
            TextView textView = (TextView) this.targetView.LIZIZ(R.id.title);
            Context context = this.targetView.getContext();
            o.LJIIIIZZ(context, "targetView.context");
            textView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gp, context));
        }
        C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 14, 42), this.targetView);
        View LIZIZ = this.targetView.LIZIZ(R.id.bt5);
        o.LJIIIIZZ(LIZIZ, "targetView.contentView");
        C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 15, 42), LIZIZ);
        this.targetView.LIZIZ(R.id.bt5).findViewById(R.id.l3h).setFocusable(false);
        ((TextView) this.targetView.LIZIZ(R.id.bt5).findViewById(R.id.l3h)).setCursorVisible(false);
        this.targetView.LIZIZ(R.id.bt5).findViewById(R.id.l3h).setFocusableInTouchMode(false);
        TextView textView2 = (TextView) this.targetView.LIZIZ(R.id.bt5).findViewById(R.id.l3h);
        Context context2 = this.targetView.getContext();
        o.LJIIIIZZ(context2, "targetView.context");
        textView2.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gp, context2));
        View findViewById = this.targetView.LIZIZ(R.id.bt5).findViewById(R.id.l3h);
        o.LJIIIIZZ(findViewById, "targetView.contentView.textView");
        C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 16, 42), findViewById);
        C16880lQ.LJJJ((TuxIconView) this.targetView.LIZIZ(R.id.bt5).findViewById(R.id.a7n), null);
        TuxIconView tuxIconView = (TuxIconView) this.targetView.LIZIZ(R.id.bt5).findViewById(R.id.a7n);
        Context context3 = this.targetView.getContext();
        o.LJIIIIZZ(context3, "targetView.context");
        tuxIconView.setTintColor(AnonymousClass636.LJIIIIZZ(R.attr.gp, context3));
        C16880lQ.LJIIZILJ((LinearLayout) this.targetView.LIZIZ(R.id.bt5).findViewById(R.id.g1r), null);
    }

    public final void setInputItem(C27021Aj3 c27021Aj3) {
        this.inputItem = c27021Aj3;
    }

    public final void showLocateMsgToast(Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            C26045AKb c26045AKb = new C26045AKb(this.targetView);
            c26045AKb.LJIIIZ(this.targetView.getContext().getString(intValue));
            c26045AKb.LJIIJ();
        }
    }

    @Override // X.InterfaceC60061Nhh
    public void onEvent(String eventName, String params) {
        String str;
        List<Region> list;
        MapLocateEvent mapLocateEvent;
        InputItemDTO inputItemDTO;
        o.LJIIIZ(eventName, "eventName");
        o.LJIIIZ(params, "params");
        C27021Aj3 c27021Aj3 = this.inputItem;
        if (c27021Aj3 != null && (inputItemDTO = c27021Aj3.LIZ) != null) {
            str = inputItemDTO.key;
        } else {
            str = null;
        }
        if (o.LJ(str, "districts")) {
            if (o.LJ(eventName, "ec_address_locate_status")) {
                if (!this.viewModel.gw0()) {
                    return;
                }
                MapLocateEvent.Companion.getClass();
                try {
                    Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), params, C65330PkU.LIZJ(C65352Pkq.LIZLLL(MapLocateEvent.class)));
                    if (!(fromJson instanceof MapLocateEvent)) {
                        fromJson = null;
                    }
                    mapLocateEvent = (MapLocateEvent) fromJson;
                } catch (s unused) {
                    mapLocateEvent = null;
                }
                if (mapLocateEvent == null) {
                    mapLocateEvent = new MapLocateEvent(-1, Integer.valueOf(R.string.f6u), "app format locate event json error");
                }
                int i = mapLocateEvent.locateStatus;
                if (i != -1) {
                    if (i == 1) {
                        AddressEditViewModel addressEditViewModel = this.viewModel;
                        addressEditViewModel.LLD = true;
                        XKX.LIZLLL(ViewModelKt.getViewModelScope(addressEditViewModel), C36636EZk.LIZ, null, new C27277AnB(this, null), 2);
                        return;
                    }
                    return;
                }
                XKX.LIZLLL(ViewModelKt.getViewModelScope(this.viewModel), C36636EZk.LIZ, null, new C27276AnA(this, mapLocateEvent, null), 2);
                return;
            }
            if (o.LJ(eventName, "ec_district_select")) {
                try {
                    Object fromJson2 = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), params, C65330PkU.LIZJ(C65352Pkq.LJI(SelectDistrictEvent.class)));
                    if (!(fromJson2 instanceof SelectDistrictEvent)) {
                        fromJson2 = null;
                    }
                    SelectDistrictEvent selectDistrictEvent = (SelectDistrictEvent) fromJson2;
                    if (selectDistrictEvent != null && (list = selectDistrictEvent.regions) != null) {
                        handleSelectDistrict(list);
                    }
                } catch (s unused2) {
                }
            }
        }
    }

    public final void openRegionPickerPage(String str, List<Region> list) {
        String str2;
        String str3;
        Object obj;
        String str4;
        InputItemDTO inputItemDTO;
        ClientConfig clientConfig = this.viewModel.LLIIJI;
        C27021Aj3 c27021Aj3 = this.inputItem;
        if (c27021Aj3 != null && (inputItemDTO = c27021Aj3.LIZ) != null) {
            str2 = inputItemDTO.key;
        } else {
            str2 = null;
        }
        boolean LIZ = C27452Aq0.LIZ(clientConfig, str2);
        LinkedHashMap LIZ2 = C0JU.LIZ("geo_name_id", str);
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            ORS.LJJLIIIJILLIZJL(list, arrayList);
            LIZ2.put("current_selected_region_list", arrayList);
        }
        LIZ2.put("level_count", Integer.MAX_VALUE);
        if (this.viewModel.LLFF == null) {
            str3 = "add";
        } else {
            str3 = "edit";
        }
        LIZ2.put("page_info", str3);
        LIZ2.put("if_auto_locate", Boolean.valueOf(this.viewModel.LLD));
        HashMap<String, Object> hashMap = this.viewModel.LJLLLL;
        String str5 = "";
        if (hashMap == null || (obj = hashMap.get("entrance_info")) == null) {
            obj = "";
        }
        LIZ2.put("entrance_info", obj);
        Region region = this.viewModel.LJLJLJ;
        if (region != null && (str4 = region.code) != null) {
            str5 = str4.toLowerCase(Locale.ROOT);
            o.LJIIIIZZ(str5, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        }
        LIZ2.put("location", str5);
        LIZ2.put("without_next_level", Boolean.valueOf(LIZ));
        Context context = this.targetView.getContext();
        o.LJIIIIZZ(context, "targetView.context");
        C26867AgZ.LIZIZ(context, "aweme://ec/address/region_picker", LIZ2, false).open();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if (r26.viewModel.cw0("us") != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        X.C27452Aq0.LIZIZ(0, r27, r28, Integer.MAX_VALUE, r9, r10, new kotlin.jvm.internal.AqS154S0100000_4(r26, 124), new kotlin.jvm.internal.AqS170S0100000_4(r26, 196), null, java.lang.Boolean.valueOf(r3), java.lang.Boolean.valueOf(r6), null, r17, r1, null, null, null, r2, null, r24, 758275);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0085, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008a, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
    
        if (r24 == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void showRegionDialog(java.lang.String r27, java.util.List<com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region> r28) {
        /*
            r26 = this;
            r4 = r26
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel r0 = r4.viewModel
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClientConfig r1 = r0.LLIIJI
            X.Aj3 r0 = r4.inputItem
            r2 = 0
            if (r0 == 0) goto L8f
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemDTO r0 = r0.LIZ
            if (r0 == 0) goto L8f
            java.lang.String r0 = r0.key
        L11:
            boolean r24 = X.C27452Aq0.LIZ(r1, r0)
            androidx.fragment.app.FragmentManager r9 = r4.fragmentManager
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel r1 = r4.viewModel
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address r0 = r1.LLFF
            if (r0 != 0) goto L8c
            java.lang.String r10 = "add"
        L1f:
            boolean r1 = r1.LLD
            X.9wM r0 = r4.targetView
            X.Rtn r17 = X.C78948Uye.LJIILIIL(r0)
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel r0 = r4.viewModel
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region r0 = r0.LJLJLJ
            if (r0 == 0) goto L3c
            java.lang.String r3 = r0.code
            if (r3 == 0) goto L3c
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r2 = r3.toLowerCase(r0)
            java.lang.String r0 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
        L3c:
            r6 = 1
            java.lang.String r5 = "us"
            if (r24 != 0) goto L86
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel r0 = r4.viewModel
            boolean r0 = r0.cw0(r5)
            if (r0 == 0) goto L86
            r3 = 1
        L4a:
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel r0 = r4.viewModel
            boolean r0 = r0.cw0(r5)
            if (r0 == 0) goto L8a
        L52:
            r5 = 0
            r8 = 2147483647(0x7fffffff, float:NaN)
            kotlin.jvm.internal.AqS154S0100000_4 r11 = new kotlin.jvm.internal.AqS154S0100000_4
            r0 = 124(0x7c, float:1.74E-43)
            r11.<init>(r4, r0)
            kotlin.jvm.internal.AqS170S0100000_4 r12 = new kotlin.jvm.internal.AqS170S0100000_4
            r0 = 196(0xc4, float:2.75E-43)
            r12.<init>(r4, r0)
            r13 = 0
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r3)
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r6)
            r25 = 758275(0xb9203, float:1.06257E-39)
            r6 = r27
            r7 = r28
            r16 = r13
            r18 = r1
            r19 = r13
            r20 = r13
            r21 = r13
            r22 = r2
            r23 = r13
            X.C27452Aq0.LIZIZ(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return
        L86:
            r3 = 0
            if (r24 != 0) goto L8a
            goto L4a
        L8a:
            r6 = 0
            goto L52
        L8c:
            java.lang.String r10 = "edit"
            goto L1f
        L8f:
            r0 = r2
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.address.edit.helper.RegionSelectHelper.showRegionDialog(java.lang.String, java.util.List):void");
    }

    public RegionSelectHelper(C252989wM targetView, FragmentManager fragmentManager, AddressEditViewModel viewModel, boolean z) {
        o.LJIIIZ(targetView, "targetView");
        o.LJIIIZ(viewModel, "viewModel");
        this.targetView = targetView;
        this.fragmentManager = fragmentManager;
        this.viewModel = viewModel;
        this.zipcodeRecommend = z;
        this.dynamicStyle$delegate = C221108m2.LIZIZ(new AqS154S0100000_4(this, 123));
    }

    public /* synthetic */ RegionSelectHelper(C252989wM c252989wM, FragmentManager fragmentManager, AddressEditViewModel addressEditViewModel, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c252989wM, fragmentManager, addressEditViewModel, (i & 8) != 0 ? true : z);
    }
}
