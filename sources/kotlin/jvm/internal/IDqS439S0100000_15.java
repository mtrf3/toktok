package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.ActivityC86117Xqz;
import X.C223208pQ;
import X.C34K;
import X.C36661cE;
import X.C72912tb;
import X.C76800UCe;
import X.C86807Y5b;
import X.C86808Y5c;
import X.C86815Y5j;
import X.C87612Ya0;
import X.C8HZ;
import X.EnumC84576XHg;
import X.InterfaceC86124Xr6;
import X.InterfaceC88473Ynt;
import X.OSZ;
import X.X1D;
import X.Y5M;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.ext_power_list.AssemSingleListViewModel;
import com.bytedance.pipo.ocr.bean.PipoOcrResult;
import com.bytedance.pipo.ocr.ocr.OcrViewModel;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.favorites.business.aweme.AwemeCollectionAgent;
import com.ss.android.ugc.aweme.favorites.business.aweme.AwemeCollectionCountAgent;
import com.ss.android.ugc.aweme.favorites.business.playlist.PlaylistCollectionStateAgent;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import com.ss.android.ugc.aweme.poi.videopublish.v2.PoiPublishExtensionVMV2;
import com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAssemV2;
import ij2.a;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* loaded from: classes16.dex */
public class IDqS439S0100000_15 extends AbstractC65781Prl implements InterfaceC88473Ynt {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC88473Ynt
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            case 4:
                return invoke$4(this, obj, obj2, obj3);
            case 5:
                return invoke$5(this, obj, obj2, obj3);
            case 6:
                return invoke$6(this, obj, obj2, obj3);
            case 7:
                return invoke$7(this, obj, obj2, obj3);
            case 8:
                return invoke$8(this, obj, obj2, obj3);
            case 9:
                return invoke$9(this, obj, obj2, obj3);
            case 10:
                return invoke$10(this, obj, obj2, obj3);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj, obj2, obj3);
            case 12:
                return invoke$12(this, obj, obj2, obj3);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this, obj, obj2, obj3);
            case 14:
                return invoke$14(this, obj, obj2, obj3);
            case 15:
                return invoke$15(this, obj, obj2, obj3);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this, obj, obj2, obj3);
            case 17:
                return invoke$17(this, obj, obj2, obj3);
            case 18:
                return invoke$18(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS439S0100000_15(C34K c34k, int i) {
        super(3);
        this.$t = i;
        this.l0 = c34k;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS439S0100000_15(Configuration configuration, int i) {
        super(3);
        this.$t = i;
        this.l0 = configuration;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS439S0100000_15(Bundle bundle, int i) {
        super(3);
        this.$t = i;
        this.l0 = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS439S0100000_15(AssemSingleListViewModel assemSingleListViewModel, AssemSingleListViewModel<ITEM, S, Cursor> assemSingleListViewModel2) {
        super(3);
        this.$t = assemSingleListViewModel2;
        this.l0 = assemSingleListViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS439S0100000_15(AwemeCollectionAgent awemeCollectionAgent, int i) {
        super(3);
        this.$t = i;
        this.l0 = awemeCollectionAgent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS439S0100000_15(AwemeCollectionCountAgent awemeCollectionCountAgent, int i) {
        super(3);
        this.$t = i;
        this.l0 = awemeCollectionCountAgent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS439S0100000_15(PlaylistCollectionStateAgent playlistCollectionStateAgent, int i) {
        super(3);
        this.$t = i;
        this.l0 = playlistCollectionStateAgent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS439S0100000_15(PoiPublishExtensionVMV2 poiPublishExtensionVMV2, int i) {
        super(3);
        this.$t = i;
        this.l0 = poiPublishExtensionVMV2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS439S0100000_15(UserAwemePagerAssemV2 userAwemePagerAssemV2, int i) {
        super(3);
        this.$t = i;
        this.l0 = userAwemePagerAssemV2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS439S0100000_15(AqS162S0200000_15 aqS162S0200000_15, int i) {
        super(3);
        this.$t = i;
        this.l0 = aqS162S0200000_15;
    }

    public final void LIZ$0(C87612Ya0 startNode, Set<C87612Ya0> traveled, LinkedList<C87612Ya0> stack) {
        o.LJIIIZ(startNode, "startNode");
        o.LJIIIZ(traveled, "traveled");
        o.LJIIIZ(stack, "stack");
        if (((C34K) this.l0).element) {
            return;
        }
        if (stack.contains(startNode)) {
            ((C34K) this.l0).element = true;
            return;
        }
        if (!traveled.contains(startNode)) {
            traveled.add(startNode);
            stack.add(startNode);
            Iterator<C87612Ya0> it = startNode.LIZ.LIZIZ.iterator();
            while (it.hasNext()) {
                LIZ$0(it.next(), traveled, stack);
            }
            stack.removeLast();
        }
    }

    public static final /* bridge */ /* synthetic */ Object invoke$0(IDqS439S0100000_15 iDqS439S0100000_15, Object obj, Object obj2, Object obj3) {
        iDqS439S0100000_15.LIZ$0((C87612Ya0) obj, (Set) obj2, (LinkedList) obj3);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS439S0100000_15 iDqS439S0100000_15, Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        String str = (String) obj2;
        C36661cE c36661cE = (C36661cE) obj3;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ocrResponse: ");
        LIZ.append(c36661cE);
        LIZ.append(", ");
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        try {
            if (booleanValue && c36661cE != null) {
                try {
                    if (c36661cE.LJIIL) {
                        c36661cE.LIZ((Bitmap) ((AqS162S0200000_15) iDqS439S0100000_15.l0).l1);
                        a aVar = a.LJIJ;
                        long currentTimeMillis = System.currentTimeMillis();
                        OcrViewModel ocrViewModel = ((Y5M) ((AqS162S0200000_15) iDqS439S0100000_15.l0).l0).LJLIL;
                        long j = currentTimeMillis - ocrViewModel.LJLILLLLZI;
                        long j2 = ocrViewModel.LJLJI;
                        long j3 = ocrViewModel.LJLJJI;
                        long j4 = ocrViewModel.LJLJJL;
                        aVar.getClass();
                        a.LJII(j, j2, j3, j4, "success");
                        a.LJIILL = "server";
                        Bitmap finalClipImage = (Bitmap) ((AqS162S0200000_15) iDqS439S0100000_15.l0).l1;
                        o.LJIIIIZZ(finalClipImage, "finalClipImage");
                        a.LIZLLL(finalClipImage, new C86807Y5b(iDqS439S0100000_15, c36661cE));
                    } else {
                        a aVar2 = a.LJIJ;
                        String valueOf = String.valueOf(101);
                        long currentTimeMillis2 = System.currentTimeMillis();
                        OcrViewModel ocrViewModel2 = ((Y5M) ((AqS162S0200000_15) iDqS439S0100000_15.l0).l0).LJLIL;
                        long j5 = currentTimeMillis2 - ocrViewModel2.LJLILLLLZI;
                        long j6 = ocrViewModel2.LJLJI;
                        long j7 = ocrViewModel2.LJLJJI;
                        long j8 = ocrViewModel2.LJLJJL;
                        aVar2.getClass();
                        a.LJII(j5, j6, j7, j8, valueOf);
                        MutableLiveData<C86815Y5j> mutableLiveData = ((Y5M) ((AqS162S0200000_15) iDqS439S0100000_15.l0).l0).LJLIL.LJLIL;
                        PipoOcrResult.CREATOR.getClass();
                        mutableLiveData.postValue(new C86815Y5j(0, 101, "", C86808Y5c.LIZ(c36661cE)));
                    }
                } catch (Throwable th) {
                    th = th;
                    a aVar3 = a.LJIJ;
                    String valueOf2 = String.valueOf(108);
                    long currentTimeMillis3 = System.currentTimeMillis();
                    OcrViewModel ocrViewModel3 = ((Y5M) ((AqS162S0200000_15) iDqS439S0100000_15.l0).l0).LJLIL;
                    long j9 = currentTimeMillis3 - ocrViewModel3.LJLILLLLZI;
                    long j10 = ocrViewModel3.LJLJI;
                    long j11 = ocrViewModel3.LJLJJI;
                    long j12 = ocrViewModel3.LJLJJL;
                    aVar3.getClass();
                    a.LJII(j9, j10, j11, j12, valueOf2);
                    MutableLiveData<C86815Y5j> mutableLiveData2 = ((Y5M) ((AqS162S0200000_15) iDqS439S0100000_15.l0).l0).LJLIL.LJLIL;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(str);
                    LIZ2.append(", ");
                    LIZ2.append(th);
                    String LIZIZ = X1D.LIZIZ(LIZ2);
                    PipoOcrResult.CREATOR.getClass();
                    mutableLiveData2.postValue(new C86815Y5j(0, 108, LIZIZ, C86808Y5c.LIZ(c36661cE)));
                    return C76800UCe.LIZ;
                }
            } else {
                a aVar4 = a.LJIJ;
                String valueOf3 = String.valueOf(107);
                long currentTimeMillis4 = System.currentTimeMillis();
                OcrViewModel ocrViewModel4 = ((Y5M) ((AqS162S0200000_15) iDqS439S0100000_15.l0).l0).LJLIL;
                long j13 = currentTimeMillis4 - ocrViewModel4.LJLILLLLZI;
                long j14 = ocrViewModel4.LJLJI;
                long j15 = ocrViewModel4.LJLJJI;
                long j16 = ocrViewModel4.LJLJJL;
                aVar4.getClass();
                a.LJII(j13, j14, j15, j16, valueOf3);
                MutableLiveData<C86815Y5j> mutableLiveData3 = ((Y5M) ((AqS162S0200000_15) iDqS439S0100000_15.l0).l0).LJLIL.LJLIL;
                PipoOcrResult.CREATOR.getClass();
                mutableLiveData3.postValue(new C86815Y5j(0, 107, str, C86808Y5c.LIZ(c36661cE)));
            }
        } catch (Throwable th2) {
            th = th2;
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(IDqS439S0100000_15 iDqS439S0100000_15, Object obj, Object obj2, Object obj3) {
        InterfaceC86124Xr6 checkAndExecute = (InterfaceC86124Xr6) obj;
        ActivityC86117Xqz baseActivity = (ActivityC86117Xqz) obj2;
        o.LJIIIZ(checkAndExecute, "$this$checkAndExecute");
        o.LJIIIZ(baseActivity, "baseActivity");
        checkAndExecute.onActivityCreated(baseActivity, (Bundle) iDqS439S0100000_15.l0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(IDqS439S0100000_15 iDqS439S0100000_15, Object obj, Object obj2, Object obj3) {
        InterfaceC86124Xr6 checkAndExecute = (InterfaceC86124Xr6) obj;
        ActivityC86117Xqz baseActivity = (ActivityC86117Xqz) obj2;
        o.LJIIIZ(checkAndExecute, "$this$checkAndExecute");
        o.LJIIIZ(baseActivity, "baseActivity");
        checkAndExecute.onActivitySaveInstanceState(baseActivity, (Bundle) iDqS439S0100000_15.l0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(IDqS439S0100000_15 iDqS439S0100000_15, Object obj, Object obj2, Object obj3) {
        InterfaceC86124Xr6 checkAndExecute = (InterfaceC86124Xr6) obj;
        ActivityC86117Xqz baseActivity = (ActivityC86117Xqz) obj2;
        o.LJIIIZ(checkAndExecute, "$this$checkAndExecute");
        o.LJIIIZ(baseActivity, "baseActivity");
        checkAndExecute.onActivityPostCreated(baseActivity, (Bundle) iDqS439S0100000_15.l0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(IDqS439S0100000_15 iDqS439S0100000_15, Object obj, Object obj2, Object obj3) {
        InterfaceC86124Xr6 checkAndExecute = (InterfaceC86124Xr6) obj;
        ActivityC86117Xqz baseActivity = (ActivityC86117Xqz) obj2;
        o.LJIIIZ(checkAndExecute, "$this$checkAndExecute");
        o.LJIIIZ(baseActivity, "baseActivity");
        checkAndExecute.onActivityPostSaveInstanceState(baseActivity, (Bundle) iDqS439S0100000_15.l0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$14(IDqS439S0100000_15 iDqS439S0100000_15, Object obj, Object obj2, Object obj3) {
        InterfaceC86124Xr6 checkAndExecute = (InterfaceC86124Xr6) obj;
        ActivityC86117Xqz baseActivity = (ActivityC86117Xqz) obj2;
        o.LJIIIZ(checkAndExecute, "$this$checkAndExecute");
        o.LJIIIZ(baseActivity, "baseActivity");
        checkAndExecute.onActivityPreCreated(baseActivity, (Bundle) iDqS439S0100000_15.l0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$15(IDqS439S0100000_15 iDqS439S0100000_15, Object obj, Object obj2, Object obj3) {
        InterfaceC86124Xr6 checkAndExecute = (InterfaceC86124Xr6) obj;
        ActivityC86117Xqz baseActivity = (ActivityC86117Xqz) obj2;
        o.LJIIIZ(checkAndExecute, "$this$checkAndExecute");
        o.LJIIIZ(baseActivity, "baseActivity");
        checkAndExecute.onActivityPreSaveInstanceState(baseActivity, (Bundle) iDqS439S0100000_15.l0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(IDqS439S0100000_15 iDqS439S0100000_15, Object obj, Object obj2, Object obj3) {
        InterfaceC86124Xr6 checkAndExecute = (InterfaceC86124Xr6) obj;
        ActivityC86117Xqz baseActivity = (ActivityC86117Xqz) obj2;
        o.LJIIIZ(checkAndExecute, "$this$checkAndExecute");
        o.LJIIIZ(baseActivity, "baseActivity");
        checkAndExecute.onConfigurationChanged(baseActivity, (Configuration) iDqS439S0100000_15.l0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$17(IDqS439S0100000_15 iDqS439S0100000_15, Object obj, Object obj2, Object obj3) {
        InterfaceC86124Xr6 checkAndExecute = (InterfaceC86124Xr6) obj;
        o.LJIIIZ(checkAndExecute, "$this$checkAndExecute");
        o.LJIIIZ(obj2, "<anonymous parameter 0>");
        checkAndExecute.onPreRestoreInstanceState((Bundle) iDqS439S0100000_15.l0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$18(IDqS439S0100000_15 iDqS439S0100000_15, Object obj, Object obj2, Object obj3) {
        InterfaceC86124Xr6 checkAndExecute = (InterfaceC86124Xr6) obj;
        o.LJIIIZ(checkAndExecute, "$this$checkAndExecute");
        o.LJIIIZ(obj2, "<anonymous parameter 0>");
        checkAndExecute.onRestoreInstanceState((Bundle) iDqS439S0100000_15.l0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS439S0100000_15 iDqS439S0100000_15, Object obj, Object obj2, Object obj3) {
        boolean z;
        C8HZ state = (C8HZ) obj;
        o.LJIIIZ(state, "state");
        ((AssemSingleListViewModel) iDqS439S0100000_15.l0).lastPageResult = new OSZ<>(obj2, obj3);
        boolean z2 = true;
        if (obj2 != null) {
            z = true;
        } else {
            z = false;
        }
        if (obj3 == null) {
            z2 = false;
        }
        return C8HZ.LIZIZ(state, new C72912tb(new C223208pQ(z, z2)), null, null, null, 14);
    }

    public static final Object invoke$3(IDqS439S0100000_15 iDqS439S0100000_15, Object obj, Object obj2, Object obj3) {
        boolean z;
        C8HZ state = (C8HZ) obj;
        o.LJIIIZ(state, "state");
        AssemSingleListViewModel assemSingleListViewModel = (AssemSingleListViewModel) iDqS439S0100000_15.l0;
        assemSingleListViewModel.lastPageResult = OSZ.copy$default(assemSingleListViewModel.lastPageResult, obj2, null, 2, null);
        boolean z2 = true;
        if (obj2 != null) {
            z = true;
        } else {
            z = false;
        }
        if (obj3 == null) {
            z2 = false;
        }
        return C8HZ.LIZIZ(state, null, null, new C72912tb(new C223208pQ(z, z2)), null, 11);
    }

    public static final Object invoke$4(IDqS439S0100000_15 iDqS439S0100000_15, Object obj, Object obj2, Object obj3) {
        boolean z;
        C8HZ state = (C8HZ) obj;
        o.LJIIIZ(state, "state");
        AssemSingleListViewModel assemSingleListViewModel = (AssemSingleListViewModel) iDqS439S0100000_15.l0;
        boolean z2 = true;
        assemSingleListViewModel.lastPageResult = OSZ.copy$default(assemSingleListViewModel.lastPageResult, null, obj3, 1, null);
        if (obj2 != null) {
            z = true;
        } else {
            z = false;
        }
        if (obj3 == null) {
            z2 = false;
        }
        return C8HZ.LIZIZ(state, null, new C72912tb(new C223208pQ(z, z2)), null, null, 13);
    }

    public static final Object invoke$5(IDqS439S0100000_15 iDqS439S0100000_15, Object obj, Object obj2, Object obj3) {
        String id = (String) obj;
        EnumC84576XHg operation = (EnumC84576XHg) obj3;
        o.LJIIIZ(id, "id");
        o.LJIIIZ(operation, "operation");
        if (obj2 != null) {
            ((AwemeCollectionAgent) iDqS439S0100000_15.l0).LJIIJJI(id, obj2, operation);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(IDqS439S0100000_15 iDqS439S0100000_15, Object obj, Object obj2, Object obj3) {
        String id = (String) obj;
        EnumC84576XHg operation = (EnumC84576XHg) obj3;
        o.LJIIIZ(id, "id");
        o.LJIIIZ(operation, "operation");
        if (obj2 != null) {
            ((AwemeCollectionCountAgent) iDqS439S0100000_15.l0).LJIIJJI(id, obj2, operation);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(IDqS439S0100000_15 iDqS439S0100000_15, Object obj, Object obj2, Object obj3) {
        String id = (String) obj;
        EnumC84576XHg operation = (EnumC84576XHg) obj3;
        o.LJIIIZ(id, "id");
        o.LJIIIZ(operation, "operation");
        if (obj2 != null) {
            ((PlaylistCollectionStateAgent) iDqS439S0100000_15.l0).LJIIJJI(id, obj2, operation);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(IDqS439S0100000_15 iDqS439S0100000_15, Object selectSubscribe, Object obj, Object obj2) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        ((UserAwemePagerAssemV2) iDqS439S0100000_15.l0).k7((String) obj, (String) obj2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(IDqS439S0100000_15 iDqS439S0100000_15, Object obj, Object obj2, Object obj3) {
        long longValue = ((Number) obj2).longValue();
        PoiPublishExtensionVMV2 poiPublishExtensionVMV2 = (PoiPublishExtensionVMV2) iDqS439S0100000_15.l0;
        poiPublishExtensionVMV2.LJLJL = longValue;
        poiPublishExtensionVMV2.LJLJJI = (Long) obj3;
        poiPublishExtensionVMV2.setState(new AqS181S0100000_15((PoiSearchApi.PoiSearchResultWrapper) obj, 231));
        return C76800UCe.LIZ;
    }
}
