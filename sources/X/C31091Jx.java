package X;

import com.bytedance.android.live.broadcast.model.PushStreamInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.1Jx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31091Jx extends PushStreamInfo.Quality implements Comparable<C31091Jx> {
    public C31091Jx(PushStreamInfo.Quality quality) {
        this.sdkKey = quality.sdkKey;
        this.name = quality.name;
        this.desc = quality.desc;
        this.height = quality.height;
        this.width = quality.width;
        this.min_bitrate = quality.min_bitrate;
        this.max_bitrate = quality.max_bitrate;
        this.default_bitrate = quality.default_bitrate;
        this.fps = quality.fps;
    }

    @Override // java.lang.Comparable
    /* renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C31091Jx other) {
        String str;
        String str2;
        String str3;
        String str4;
        o.LJIIIZ(other, "other");
        String str5 = this.sdkKey;
        if (str5 == null) {
            return -1;
        }
        int hashCode = str5.hashCode();
        if (hashCode != -846238328) {
            if (hashCode != 3324) {
                if (hashCode != 3448) {
                    if (hashCode != 3665) {
                        if (hashCode != 115761) {
                            if (hashCode != 99118301 || !str5.equals("hd_60") || (str4 = other.sdkKey) == null) {
                                return -1;
                            }
                            int hashCode2 = str4.hashCode();
                            if (hashCode2 != 3324) {
                                if (hashCode2 != 3448) {
                                    if (hashCode2 != 3665) {
                                        if (hashCode2 != 99118301 || !str4.equals("hd_60")) {
                                            return -1;
                                        }
                                        return 0;
                                    }
                                    if (!str4.equals("sd")) {
                                        return -1;
                                    }
                                } else if (!str4.equals("ld")) {
                                    return -1;
                                }
                            } else if (!str4.equals("hd")) {
                                return -1;
                            }
                            return 1;
                        }
                        if (!str5.equals("uhd") || (str3 = other.sdkKey) == null) {
                            return -1;
                        }
                        int hashCode3 = str3.hashCode();
                        if (hashCode3 != 3324) {
                            if (hashCode3 != 3448) {
                                if (hashCode3 != 3665) {
                                    if (hashCode3 != 115761) {
                                        if (hashCode3 != 99118301 || !str3.equals("hd_60")) {
                                            return -1;
                                        }
                                    } else {
                                        if (!str3.equals("uhd")) {
                                            return -1;
                                        }
                                        return 0;
                                    }
                                } else if (!str3.equals("sd")) {
                                    return -1;
                                }
                            } else if (!str3.equals("ld")) {
                                return -1;
                            }
                        } else if (!str3.equals("hd")) {
                            return -1;
                        }
                        return 1;
                    }
                    if (!str5.equals("sd")) {
                        return -1;
                    }
                    String str6 = other.sdkKey;
                    if (o.LJ(str6, "ld")) {
                        return 1;
                    }
                    if (!o.LJ(str6, "sd")) {
                        return -1;
                    }
                    return 0;
                }
                if (!str5.equals("ld") || !o.LJ(other.sdkKey, "ld")) {
                    return -1;
                }
                return 0;
            }
            if (!str5.equals("hd") || (str2 = other.sdkKey) == null) {
                return -1;
            }
            int hashCode4 = str2.hashCode();
            if (hashCode4 != 3324) {
                if (hashCode4 != 3448) {
                    if (hashCode4 != 3665 || !str2.equals("sd")) {
                        return -1;
                    }
                } else if (!str2.equals("ld")) {
                    return -1;
                }
                return 1;
            }
            if (!str2.equals("hd")) {
                return -1;
            }
            return 0;
        }
        if (!str5.equals("uhd_60") || (str = other.sdkKey) == null) {
            return -1;
        }
        int hashCode5 = str.hashCode();
        if (hashCode5 != -846238328) {
            if (hashCode5 != 3324) {
                if (hashCode5 != 3448) {
                    if (hashCode5 != 3665) {
                        if (hashCode5 != 115761) {
                            if (hashCode5 != 99118301 || !str.equals("hd_60")) {
                                return -1;
                            }
                        } else if (!str.equals("uhd")) {
                            return -1;
                        }
                    } else if (!str.equals("sd")) {
                        return -1;
                    }
                } else if (!str.equals("ld")) {
                    return -1;
                }
            } else if (!str.equals("hd")) {
                return -1;
            }
            return 1;
        }
        if (!str.equals("uhd_60")) {
            return -1;
        }
        return 0;
    }
}
