package X;

import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes29.dex */
public final /* synthetic */ class ZYK {
    public static String LIZ(AbstractC90364ZdI abstractC90364ZdI) {
        StringBuilder sb = new StringBuilder(abstractC90364ZdI.zzd());
        for (int i = 0; i < abstractC90364ZdI.zzd(); i++) {
            byte zza = abstractC90364ZdI.zza(i);
            if (zza != 34) {
                if (zza != 39) {
                    if (zza != 92) {
                        switch (zza) {
                            case 7:
                                sb.append("\\a");
                                break;
                            case 8:
                                sb.append("\\b");
                                break;
                            case 9:
                                sb.append("\\t");
                                break;
                            case 10:
                                sb.append("\\n");
                                break;
                            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                                sb.append("\\v");
                                break;
                            case 12:
                                sb.append("\\f");
                                break;
                            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                                sb.append("\\r");
                                break;
                            default:
                                if (zza >= 32 && zza <= 126) {
                                    sb.append((char) zza);
                                    break;
                                } else {
                                    sb.append('\\');
                                    sb.append((char) (((zza >>> 6) & 3) + 48));
                                    sb.append((char) (((zza >>> 3) & 7) + 48));
                                    sb.append((char) ((zza & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb.append("\\\\");
                    }
                } else {
                    sb.append("\\'");
                }
            } else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }
}
