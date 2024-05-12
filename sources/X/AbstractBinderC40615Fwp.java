package X;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.play.core.assetpacks.l;
import com.google.android.play.core.assetpacks.q;

/* renamed from: X.Fwp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractBinderC40615Fwp extends BinderC40637FxB implements InterfaceC40618Fws {
    public AbstractBinderC40615Fwp() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback");
    }

    @Override // X.BinderC40637FxB
    public final boolean LJLJI(Parcel parcel, int i) {
        switch (i) {
            case 2:
                int readInt = parcel.readInt();
                C36493ETx.LIZ(parcel, Bundle.CREATOR);
                ((l) this).LJLILLLLZI.LIZJ.LIZIZ();
                q.LJFF.LIZJ("onStartDownload(%d)", 4, new Object[]{Integer.valueOf(readInt)});
                return true;
            case 3:
                int readInt2 = parcel.readInt();
                C36493ETx.LIZ(parcel, Bundle.CREATOR);
                ((l) this).LJLILLLLZI.LIZJ.LIZIZ();
                q.LJFF.LIZJ("onCancelDownload(%d)", 4, new Object[]{Integer.valueOf(readInt2)});
                return true;
            case 4:
                int readInt3 = parcel.readInt();
                C36493ETx.LIZ(parcel, Bundle.CREATOR);
                ((l) this).LJLILLLLZI.LIZJ.LIZIZ();
                q.LJFF.LIZJ("onGetSession(%d)", 4, new Object[]{Integer.valueOf(readInt3)});
                return true;
            case 5:
                LLJL(parcel.createTypedArrayList(Bundle.CREATOR));
                return true;
            case 6:
                Parcelable.Creator creator = Bundle.CREATOR;
                BaseBundle baseBundle = (BaseBundle) C36493ETx.LIZ(parcel, creator);
                C36493ETx.LIZ(parcel, creator);
                ((l) this).LJLILLLLZI.LIZJ.LIZIZ();
                q.LJFF.LIZJ("onNotifyChunkTransferred(%s, %s, %d, session=%d)", 4, new Object[]{baseBundle.getString("module_name"), baseBundle.getString("slice_id"), Integer.valueOf(baseBundle.getInt("chunk_number")), Integer.valueOf(baseBundle.getInt("session_id"))});
                return true;
            case 7:
                h((Bundle) C36493ETx.LIZ(parcel, Bundle.CREATOR));
                return true;
            case 8:
                Parcelable.Creator creator2 = Bundle.CREATOR;
                BaseBundle baseBundle2 = (BaseBundle) C36493ETx.LIZ(parcel, creator2);
                C36493ETx.LIZ(parcel, creator2);
                ((l) this).LJLILLLLZI.LIZJ.LIZIZ();
                q.LJFF.LIZJ("onNotifyModuleCompleted(%s, sessionId=%d)", 4, new Object[]{baseBundle2.getString("module_name"), Integer.valueOf(baseBundle2.getInt("session_id"))});
                return true;
            case 9:
            default:
                return false;
            case 10:
                Parcelable.Creator creator3 = Bundle.CREATOR;
                BaseBundle baseBundle3 = (BaseBundle) C36493ETx.LIZ(parcel, creator3);
                C36493ETx.LIZ(parcel, creator3);
                ((l) this).LJLILLLLZI.LIZJ.LIZIZ();
                q.LJFF.LIZJ("onNotifySessionFailed(%d)", 4, new Object[]{Integer.valueOf(baseBundle3.getInt("session_id"))});
                return true;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                Parcelable.Creator creator4 = Bundle.CREATOR;
                LL((Bundle) C36493ETx.LIZ(parcel, creator4), (Bundle) C36493ETx.LIZ(parcel, creator4));
                return true;
            case 12:
                Parcelable.Creator creator5 = Bundle.CREATOR;
                LLFII((Bundle) C36493ETx.LIZ(parcel, creator5), (Bundle) C36493ETx.LIZ(parcel, creator5));
                return true;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                Parcelable.Creator creator6 = Bundle.CREATOR;
                C36493ETx.LIZ(parcel, creator6);
                C36493ETx.LIZ(parcel, creator6);
                ((l) this).LJLILLLLZI.LIZJ.LIZIZ();
                q.LJFF.LIZJ("onRequestDownloadInfo()", 4, new Object[0]);
                return true;
            case 14:
                Parcelable.Creator creator7 = Bundle.CREATOR;
                C36493ETx.LIZ(parcel, creator7);
                C36493ETx.LIZ(parcel, creator7);
                ((l) this).LJLILLLLZI.LIZJ.LIZIZ();
                q.LJFF.LIZJ("onRemoveModule()", 4, new Object[0]);
                return true;
            case 15:
                C36493ETx.LIZ(parcel, Bundle.CREATOR);
                ((l) this).LJLILLLLZI.LIZJ.LIZIZ();
                q.LJFF.LIZJ("onCancelDownloads()", 4, new Object[0]);
                return true;
        }
    }
}
