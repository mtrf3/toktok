package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.locationservices;

import X.AnonymousClass897;
import X.C16880lQ;
import X.C188727au;
import X.C1DI;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C213988aY;
import X.C32I;
import X.C33Q;
import X.C34G;
import X.C3C8;
import X.C56179M3b;
import X.C56412MCa;
import X.C62905OmT;
import X.C62906OmU;
import X.C62907OmV;
import X.C63044Ooi;
import X.C68322mC;
import X.C76800UCe;
import X.C79045V0n;
import X.C8YN;
import X.C8YZ;
import X.FMX;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KPL;
import X.OHI;
import X.ORZ;
import X.OSK;
import X.OSL;
import X.OSM;
import X.OSZ;
import X.TBT;
import X.TBW;
import Y.IDCListenerS157S0100000_3;
import Y.IDCListenerS47S0200000_3;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.locationservices.GPSPermissionCell;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.AqS166S0200000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.AqS8S0010000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class GPSPermissionCell extends PowerCell<C213988aY> implements KPL {
    public LifecycleEventObserver LJLIL;
    public C63044Ooi LJLILLLLZI;
    public C63044Ooi LJLJI;

    @Override // X.KPL, X.C8YZ
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C8YZ getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public final C3C8 getActualReceiver() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C3C8 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C8YM
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public final void M(final LocationServicesVM locationServicesVM) {
        LifecycleEventObserver lifecycleEventObserver = this.LJLIL;
        if (lifecycleEventObserver != null) {
            getLifecycle().removeObserver(lifecycleEventObserver);
            this.LJLIL = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "location_services_setting");
        linkedHashMap.put("enter_method", "click_gps_never");
        FMX.LJIIL("system_location_setting_off_show", linkedHashMap);
        if (locationServicesVM.getState().LJLIL) {
            C63044Ooi c63044Ooi = this.LJLJI;
            if (c63044Ooi != null) {
                c63044Ooi.setChecked(false);
                C63044Ooi c63044Ooi2 = this.LJLILLLLZI;
                if (c63044Ooi2 != null) {
                    c63044Ooi2.setChecked(true);
                    Context context = this.itemView.getContext();
                    o.LJIIIIZZ(context, "itemView.context");
                    C62905OmT c62905OmT = new C62905OmT(context);
                    c62905OmT.LIZIZ = this.itemView.getContext().getResources().getString(R.string.jfz);
                    c62905OmT.LIZJ = this.itemView.getContext().getResources().getString(R.string.jfy);
                    c62905OmT.LJIIL(new IDCListenerS47S0200000_3(this, locationServicesVM, 2), this.itemView.getContext().getResources().getString(R.string.bkt), true);
                    c62905OmT.LJIIJ = new C62907OmV(new IDCListenerS157S0100000_3(this, 0), this.itemView.getContext().getResources().getString(R.string.bku), false);
                    c62905OmT.LJII = false;
                    c62905OmT.LIZJ(new AqS169S0100000_3(this, 100));
                    final C62906OmU c62906OmU = new C62906OmU(c62905OmT);
                    this.LJLIL = new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.locationservices.GPSPermissionCell$setUpNeverButtonClickEvent$4$1
                        @Override // androidx.lifecycle.LifecycleEventObserver
                        public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                            o.LJIIIZ(source, "source");
                            o.LJIIIZ(event, "event");
                            C56179M3b c56179M3b = C56179M3b.LIZ;
                            Context context2 = GPSPermissionCell.this.itemView.getContext();
                            o.LJIIIIZZ(context2, "itemView.context");
                            boolean LJIILLIIL = c56179M3b.LJIILLIIL(0, context2);
                            if (event == Lifecycle.Event.ON_RESUME && !LJIILLIIL) {
                                LocationServicesVM locationServicesVM2 = locationServicesVM;
                                locationServicesVM2.getClass();
                                locationServicesVM2.setState(new AqS8S0010000_3(false, 57));
                                c62906OmU.LIZIZ(null);
                                GPSPermissionCell.this.getLifecycle().removeObserver(this);
                                GPSPermissionCell.this.LJLIL = null;
                                C34G.LIZJ("system_location_setting_off_result", "click_gps_never", Integer.valueOf(LJIILLIIL ? 1 : 0), new AqS169S0100000_3(GPSPermissionCell.this, 101));
                            }
                        }
                    };
                    Lifecycle lifecycle = getLifecycle();
                    LifecycleEventObserver lifecycleEventObserver2 = this.LJLIL;
                    o.LJII(lifecycleEventObserver2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleEventObserver");
                    lifecycle.addObserver(lifecycleEventObserver2);
                    c62906OmU.LIZLLL();
                    return;
                }
                o.LJIJI("whileUsingBtn");
                throw null;
            }
            o.LJIJI("neverBtn");
            throw null;
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C213988aY c213988aY) {
        C213988aY t = c213988aY;
        o.LJIIIZ(t, "t");
        final ConstraintLayout whileUsingCell = (ConstraintLayout) this.itemView.findViewById(R.id.bd_);
        final ConstraintLayout neverCell = (ConstraintLayout) this.itemView.findViewById(R.id.bd9);
        View findViewById = this.itemView.findViewById(R.id.ioj);
        o.LJIIIIZZ(findViewById, "itemView.findViewById<Tu…ion_services_while_using)");
        this.LJLILLLLZI = (C63044Ooi) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.ioi);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById<Tu…_location_services_never)");
        C63044Ooi c63044Ooi = (C63044Ooi) findViewById2;
        this.LJLJI = c63044Ooi;
        LocationServicesVM locationServicesVM = t.LJLJJI;
        C63044Ooi c63044Ooi2 = this.LJLILLLLZI;
        if (c63044Ooi2 != null) {
            C8YN.LJII(this, locationServicesVM, new TBT() { // from class: X.6zz
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C178786zy) obj).LJLIL);
                }
            }, null, new AqS166S0200000_3(c63044Ooi2, c63044Ooi, 32), 6);
            final Context context = this.itemView.getContext();
            o.LJIIIIZZ(whileUsingCell, "whileUsingCell");
            final AqS150S0200000_3 aqS150S0200000_3 = new AqS150S0200000_3(this, t, 98);
            whileUsingCell.setOnTouchListener(new View.OnTouchListener() { // from class: X.8aZ
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    GPSPermissionCell gPSPermissionCell = GPSPermissionCell.this;
                    Context context2 = context;
                    ConstraintLayout constraintLayout = whileUsingCell;
                    InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = aqS150S0200000_3;
                    gPSPermissionCell.getClass();
                    GPSPermissionCell.L(context2, constraintLayout, motionEvent, interfaceC65784Pro);
                    return true;
                }
            });
            final Context context2 = this.itemView.getContext();
            o.LJIIIIZZ(neverCell, "neverCell");
            final AqS150S0200000_3 aqS150S0200000_32 = new AqS150S0200000_3(this, t, 99);
            neverCell.setOnTouchListener(new View.OnTouchListener() { // from class: X.8aZ
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    GPSPermissionCell gPSPermissionCell = GPSPermissionCell.this;
                    Context context22 = context2;
                    ConstraintLayout constraintLayout = neverCell;
                    InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = aqS150S0200000_32;
                    gPSPermissionCell.getClass();
                    GPSPermissionCell.L(context22, constraintLayout, motionEvent, interfaceC65784Pro);
                    return true;
                }
            });
            SpannableStringBuilder spannableStringBuilder = t.LJLIL;
            TextView textView = (TextView) this.itemView.findViewById(R.id.maw);
            textView.setMovementMethod(new AnonymousClass897(new AqS185S0100000_3(this, 220)));
            textView.setText(spannableStringBuilder);
            final LocationServicesVM locationServicesVM2 = t.LJLJJI;
            C16880lQ.LJJJJI((TuxTextView) this.itemView.findViewById(R.id.max), new View.OnClickListener() { // from class: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.locationservices.GPSPermissionCell$setUpOpenDevicesSettingsButton$1
                /* JADX WARN: Type inference failed for: r4v1, types: [T, java.util.ArrayList] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GPSPermissionCell gPSPermissionCell = GPSPermissionCell.this;
                    LifecycleEventObserver lifecycleEventObserver = gPSPermissionCell.LJLIL;
                    if (lifecycleEventObserver != null) {
                        gPSPermissionCell.getLifecycle().removeObserver(lifecycleEventObserver);
                        gPSPermissionCell.LJLIL = null;
                    }
                    C56179M3b c56179M3b = C56179M3b.LIZ;
                    Context context3 = GPSPermissionCell.this.itemView.getContext();
                    o.LJIIIIZZ(context3, "itemView.context");
                    boolean LJIILLIIL = c56179M3b.LJIILLIIL(0, context3);
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("enter_from", "location_services_setting");
                    c188727au.LIZLLL(LJIILLIIL ? 1 : 0, "gps_authorization");
                    FMX.LJIIL("open_device_settings", c188727au.LIZ);
                    OHI ohi = OHI.LIZ;
                    Context context4 = GPSPermissionCell.this.itemView.getContext();
                    o.LJIIIIZZ(context4, "itemView.context");
                    ohi.getClass();
                    OHI.LJIIIIZZ(context4, "android.permission.ACCESS_COARSE_LOCATION");
                    LocationServicesVM locationServicesVM3 = locationServicesVM2;
                    locationServicesVM3.getClass();
                    locationServicesVM3.LJLJJI.put(locationServicesVM3.LJLIL, "system_location_device_setting_result");
                    locationServicesVM3.LJLJJI.put(locationServicesVM3.LJLJI, Integer.valueOf(LJIILLIIL ? 1 : 0));
                    final C68322mC c68322mC = new C68322mC();
                    List<String> locationPermissions = ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).locationPermissions();
                    GPSPermissionCell gPSPermissionCell2 = GPSPermissionCell.this;
                    ?? arrayList = new ArrayList(C32I.LJJL(locationPermissions, 10));
                    for (String str : locationPermissions) {
                        OHI ohi2 = OHI.LIZ;
                        Context context5 = gPSPermissionCell2.itemView.getContext();
                        o.LJIIIIZZ(context5, "itemView.context");
                        ohi2.getClass();
                        arrayList.add(Boolean.valueOf(OHI.LJ(context5, str)));
                    }
                    c68322mC.element = arrayList;
                    final GPSPermissionCell gPSPermissionCell3 = GPSPermissionCell.this;
                    final LocationServicesVM locationServicesVM4 = locationServicesVM2;
                    gPSPermissionCell3.LJLIL = new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.locationservices.GPSPermissionCell$setUpOpenDevicesSettingsButton$1.1
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r2v3, types: [X.7au] */
                        /* JADX WARN: Type inference failed for: r6v0 */
                        /* JADX WARN: Type inference failed for: r6v1, types: [int] */
                        /* JADX WARN: Type inference failed for: r6v3 */
                        @Override // androidx.lifecycle.LifecycleEventObserver
                        public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                            ?? r6;
                            o.LJIIIZ(source, "source");
                            o.LJIIIZ(event, "event");
                            C56179M3b c56179M3b2 = C56179M3b.LIZ;
                            Context context6 = GPSPermissionCell.this.itemView.getContext();
                            o.LJIIIIZZ(context6, "itemView.context");
                            boolean LJIILLIIL2 = c56179M3b2.LJIILLIIL(0, context6);
                            if (event == Lifecycle.Event.ON_PAUSE) {
                                Context context7 = GPSPermissionCell.this.itemView.getContext();
                                o.LJIIIIZZ(context7, "itemView.context");
                                r6 = c56179M3b2.LJIILLIIL(0, context7);
                            } else {
                                r6 = 0;
                            }
                            if (event == Lifecycle.Event.ON_RESUME) {
                                List<String> locationPermissions2 = ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).locationPermissions();
                                GPSPermissionCell gPSPermissionCell4 = GPSPermissionCell.this;
                                ArrayList arrayList2 = new ArrayList(C32I.LJJL(locationPermissions2, 10));
                                for (String str2 : locationPermissions2) {
                                    OHI ohi3 = OHI.LIZ;
                                    Context context8 = gPSPermissionCell4.itemView.getContext();
                                    o.LJIIIIZZ(context8, "itemView.context");
                                    ohi3.getClass();
                                    arrayList2.add(Boolean.valueOf(OHI.LJ(context8, str2)));
                                }
                                ArrayList arrayList3 = (ArrayList) ORZ.LLJJIII(c68322mC.element, arrayList2);
                                if (arrayList3.isEmpty()) {
                                    return;
                                }
                                Iterator it = arrayList3.iterator();
                                while (it.hasNext()) {
                                    OSZ osz = (OSZ) it.next();
                                    if (((Boolean) osz.getFirst()).booleanValue() != ((Boolean) osz.getSecond()).booleanValue()) {
                                        ?? c188727au2 = new C188727au();
                                        c188727au2.LJIIIZ("enter_from", "location_services_setting");
                                        c188727au2.LIZLLL(r6, "gps_authorization");
                                        c188727au2.LIZLLL(1, "is_changed");
                                        Map<String, String> map = c188727au2.LIZ;
                                        Context context9 = GPSPermissionCell.this.itemView.getContext();
                                        ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class);
                                        o.LJIIIIZZ(context9, "context");
                                        o.LJIIIIZZ(map, "this");
                                        iLocationBaseServiceForMT.injectMobParams(context9, map);
                                        FMX.LJIIL("system_location_device_setting_result", map);
                                        LocationServicesVM locationServicesVM5 = locationServicesVM4;
                                        locationServicesVM5.getClass();
                                        locationServicesVM5.setState(new AqS8S0010000_3(LJIILLIIL2, 57));
                                        GPSPermissionCell.this.getLifecycle().removeObserver(this);
                                        GPSPermissionCell.this.LJLIL = null;
                                        return;
                                    }
                                }
                            }
                        }
                    };
                    Lifecycle lifecycle = gPSPermissionCell3.getLifecycle();
                    LifecycleEventObserver lifecycleEventObserver2 = GPSPermissionCell.this.LJLIL;
                    o.LJII(lifecycleEventObserver2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleEventObserver");
                    lifecycle.addObserver(lifecycleEventObserver2);
                }
            });
            return;
        }
        o.LJIJI("whileUsingBtn");
        throw null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.ah3, viewGroup, false, "from(parent.context)\n   …ermission, parent, false)");
    }

    public static void L(Context context, ConstraintLayout constraintLayout, MotionEvent motionEvent, InterfaceC65784Pro interfaceC65784Pro) {
        Integer valueOf;
        Integer LJI;
        Integer LJI2;
        if (motionEvent == null || (valueOf = Integer.valueOf(motionEvent.getAction())) == null) {
            return;
        }
        if (valueOf.intValue() == 0) {
            if (context == null || (LJI2 = C79045V0n.LJI(R.attr.cj, context)) == null) {
                return;
            }
            constraintLayout.setBackgroundColor(LJI2.intValue());
            return;
        }
        if (valueOf.intValue() != 1) {
            return;
        }
        if (context != null && (LJI = C79045V0n.LJI(R.attr.cl, context)) != null) {
            constraintLayout.setBackgroundColor(LJI.intValue());
        }
        interfaceC65784Pro.invoke();
    }

    @Override // X.C8YM
    public final <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJIIIIZZ(this, assemViewModel, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LIZJ(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJII(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LIZIZ(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C56412MCa<OSK<A, B, C>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super C3C8, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C212418Vh.LIZLLL(this, assemViewModel, tbw, tbw2, tbw3, c56412MCa, interfaceC88472Yns, interfaceC88474Ynu);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C56412MCa<OSL<A, B, C, D>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super C3C8, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C212418Vh.LJ(this, assemViewModel, tbw, tbw2, tbw3, tbw4, c56412MCa, interfaceC88472Yns, interfaceC88475Ynv);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C56412MCa<OSM<A, B, C, D, E>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super C3C8, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C212418Vh.LJFF(this, assemViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c56412MCa, interfaceC88472Yns, interfaceC88476Ynw);
    }
}
